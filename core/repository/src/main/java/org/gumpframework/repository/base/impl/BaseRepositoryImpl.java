package org.gumpframework.repository.base.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.gumpframework.domain.base.BaseEntity;
import org.gumpframework.repository.base.BaseRepository;
import org.gumpframework.util.LogUtil;
import org.gumpframework.util.PublicUtil;
import org.gumpframework.util.QueryUtil;
import org.gumpframework.util.bean.PageModel;
import org.gumpframework.util.bean.Parameter;
import org.gumpframework.util.bean.QueryCondition;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * 通用baseRepository实现类,create by GumpDai
 */
@Component
public class BaseRepositoryImpl<T extends BaseEntity> implements BaseRepository<T> {

    private Logger logger = LogUtil.getLogger(this.getClass());

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Session getSession() {
        return (Session) entityManager.getDelegate();
    }

    @Override
    public void flush() {
        getSession().flush();
    }

    @Override
    public void clear() {
        getSession().clear();
    }





    @Override
    public Object getByHQL(String HQL, boolean isList, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public Object getByHQL(String HQL, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public List getListSizeByHQL(String HQL, int maxSize, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public List getListSizeByHQL(String HQL, int maxSize, Object... params) {
        return null;
    }

    @Override
    public List getListByHQL(String HQL, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public List getListByHQL(String HQL, Object... params) {
        return null;
    }

    @Override
    public List<T> getEntityListByHQL(String HQL, int maxSize, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public List<T> getEntityListByHQL(String HQL, int maxSize, Object... params) {
        return null;
    }

    @Override
    public List<T> getEntityListByHQL(String HQL, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public List<T> getEntityListByHQL(String HQL, Object... params) {
        return null;
    }

    @Override
    public Object getObjectByHQL(String HQL, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public Object getObjectByHQL(String HQL, Object... params) {
        return null;
    }

    @Override
    public T getEntityByHQL(String HQL, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public T getEntityByHQL(String HQL, Object... params) {
        return null;
    }


    @Override
    public List getListSizeBySQL(String SQL, int maxSize, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public List getListSizeBySQL(String SQL, int maxSize, Object... params) {
        return null;
    }


    @Override
    public Object getObjectBySQL(String SQL, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public Object getObjectBySQL(String SQL, Object... params) {
        return null;
    }



    @Override
    public Boolean doCheckByProperty(T entity) {
        return null;
    }

    @Override
    public Boolean doCheckByPK(T entity) {
        return null;
    }

    @Override
    public int execute(String HQL, Object... params) {
        return 0;
    }

    @Override
    public int executeSQL(String SQL, Object... params) {
        return 0;
    }

    @Override
    public void executeCall(String call, Object... params) {

    }

    @Override
    public PageModel<?> getHQLPage(String QL, PageModel<?> pm, Object... params) {
        return null;
    }

    @Override
    public PageModel<?> getSQLPage(String QL, PageModel<?> pm, Object... params) {
        return null;
    }

    @Override
    public PageModel<?> getHQLPage(String QL, PageModel<?> pm, boolean isCal, boolean isCache, Object... params) {
        return null;
    }

    @Override
    public PageModel<?> getSQLPage(String QL, PageModel<?> pm, boolean isCal, boolean isCache, Object... params) {
        return null;
    }

    @Override
    public PageModel<?> getQLPage(String QL, PageModel<?> pm, boolean isSql, boolean isCal, boolean isCache, Object... params) {
        return null;
    }

    @Override
    public Long getCountByQL(String QL, boolean isSql, boolean isCache, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public Object getBySQL(String SQL, boolean isList, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    @Override
    public Object getBySQL(String SQL, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params) {
        return null;
    }

    /**
     * 根据传入的sql  conditionList  以及 参数 来查询 结果集 一般为   List<Map<String,Object>>
     * @param SQL
     * @param conditionList
     * @param params
     * @return
     */
    @Override
    public List getListBySQL(String SQL, List<QueryCondition> conditionList, Object... params) {
        return (List) getByQL(SQL,true,false,true,0,conditionList,params);
    }

    /**
     * 根据传入的sql 和 参数查询 list 结果集 ,一般为  List<Map<String,Object>>
     * @param SQL
     * @param params
     * @return
     */
    @Override
    public List getListBySQL(String SQL, Object... params) {
        return (List) getByQL(SQL,true,false,true,0,null,params);
    }


    /**
     * 与数据库直接交互的方法，返回结果供其他重载方法调用
     * @param QL
     * @param isSql
     * @param isCache
     * @param isList
     * @param maxSize
     * @param conditionList
     * @param params  按照順序傳入的查詢參數
     * @return
     */
    @Override
    public Object getByQL(String QL, boolean isSql, boolean isCache, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params) {

        try {
            Map<String, Object> map = Maps.newHashMap();

            //判断conditionList是否为空，不为空则拼接到ql查询中

//            if (PublicUtil.isNotEmpty(conditionList))
//                QL = QueryUtil.convertJsonToQueryCondition(QL, conditionList, null, map);

            //创建 sql query 或者  hql query
            Query query = isSql ? createSqlQuery(QL,map,params) : createQuery(QL,map,params);
            //设置缓存
            if (isCache)
                query.setCacheable(true);
            //设置查询的条数
            if (isList && maxSize != 0) {
                query.setMaxResults(maxSize);
                maxSize = 0;
            }
            List lst = query.list();
            //如果是sql ，則將結果封裝為  List<Map<String,Object>>
            if (isSql)   lst = parseSqlRsList(lst, isSql, QL);

            //如果不是list,返回list结果的第一条
            if (!isList) {
                return PublicUtil.isNotEmpty(lst) ? lst.get(0) : null;
            } else {
                return lst;
            }
        } catch (Exception e) {
            logger.error("QL------->" + QL);
            logger.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public SQLQuery createSqlQuery(String SQL, Object... params) {
        SQLQuery query = getSession().createSQLQuery(SQL);
        Map<String, Object> map = new Parameter(params); // 傳入的第一個是 一個沒有元素的map對象
        setParams(SQL, query, map);
        return query;
    }

    @Override
    public Query createQuery(String HQL, Object... params) {
        Query query = getSession().createQuery(HQL);
        Map<String,Object> map = new Parameter(params);
        setParams(HQL,query,map);
        return query;
    }

    /**
     * 将数据库返回的list按照类型封装  工具類
     * @param lst
     * @param isSql
     * @param QL
     * @return
     */
    public List parseSqlRsList(List lst, boolean isSql, String QL) {

        if (lst != null && lst.size() > 0) {
            if (isSql && (QL.contains(" as ") || QL.contains(" AS "))) {
                int fromIndex = QueryUtil.findOuterFromIndex(QL.toUpperCase());  //在sql中寻找与最外层select对应的from的index 调用前请先转成大写。

                String columnStr = QL.substring(7, fromIndex);

                String[] columns = QueryUtil.getColumnNames3(columnStr); //獲取到的sql中的as key

                List<Map<String, Object>> rsList = Lists.newArrayList(); //返回的結果

                Map<String, Object> map = Maps.newHashMap();
                for (Object item : lst) { //遍歷每一行
                    map = Maps.newHashMap();
                    if (item != null && item.getClass().isArray()) {
                        Object[] items = (Object[]) item;
                        for (int i = 0; i < items.length; i++) { //遍歷每一列
                            String key = columns[i];
                            map.put((key.indexOf(",") != -1 ? key.substring(0, key.indexOf(",")) : key).replace(" ",
                                    ""), items[i]);
                        }
                    } else {
                        for (int i = 0; i < columns.length; i++) {
                            String key = columns[i];
                            map.put((key.indexOf(",") != -1 ? key.substring(0, key.indexOf(",")) : key).replace(" ",
                                    ""), item);
                        }
                    }
                    rsList.add(map);
                }
                if (rsList != null && rsList.size() > 0)
                    lst = rsList;
            }
        }
        return lst;
    }


    /**
     * 自动将参数注入到Query对象中  工具類
     *
     * @param QL
     * @param query
     * @param params  此時的參數中已經封裝好了 順序 p1 -> pn
     */
    private void setParams(String QL, Query query, Map<String, Object> params) {
        if (PublicUtil.isNotEmpty(params)) {
            logger.info("params {}", params);
            Iterator<String> keys = params.keySet().iterator();
            String key = "";
            Object val = null;
            StringBuffer sb = new StringBuffer();
            while (keys.hasNext()) {
                key = keys.next();
                val = params.get(key);
                if (!QL.contains(PublicUtil.toAppendStr(":", key))) {
                    logger.warn("多余的参数:" + key + ",值：" + val);
                    continue;
                }
                sb.append(key).append("=").append(val).append(", ");
                query.setParameter(key, val);
            }
            logger.info(sb.toString());
        }
    }

}
