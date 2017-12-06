package org.gumpframework.util.bean;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;


@Slf4j
public class Parameter extends HashMap<String, Object> implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 构造类，例：new Parameter(id, parentIds)
	 * 
	 * @param values 参数值
	 */
	public Parameter(Object[] values) {
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				// if (PublicUtil.isNotEmpty(values[i])) {
				if (values[i] != null && values[i] instanceof Map) { //如果參數是map對象，
					putAll((Map<? extends String, ? extends Object>) values[i]);
				} else if (values[i] != null && values[i].getClass().isArray()) {//如果是集合
					putAll(new Parameter((Object[]) values[i]));
				} else { //其他則按照 p1 到 後面排序
					put("p" + (i + 1), values[i]);
				}
				// }
			}
		}
	}

	/**
	 * 构造类，例：new Parameter(new Object[][]{{"id", id}, {"parentIds", parentIds}})
	 * 
	 * @param parameters 参数二维数组
	 */
	public Parameter(Object[][] parameters) {
		if (parameters != null) {
			for (Object[] os : parameters) {
				if (os.length == 2) {
					put((String) os[0], os[1]);
				}
			}
		}
	}



}
