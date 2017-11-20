package org.gumpframework.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工具类  create by GumpDai
 */
public class LogUtil {

    /**
     * 返回logger 对象
     * @param className
     * @return
     */
    public static Logger getLogger(Class<?> className){
        return LoggerFactory.getLogger(className);
    }
}

