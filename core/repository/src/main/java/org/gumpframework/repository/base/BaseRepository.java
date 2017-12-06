package org.gumpframework.repository.base;

import org.gumpframework.domain.base.BaseEntity;
import org.gumpframework.util.bean.PageModel;
import org.gumpframework.util.bean.QueryCondition;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.util.List;

/**
 * 通用repository 接口类， create by GumpDai
 * Email  xinyudai_ifox@icloud.com
 */
public interface BaseRepository<T extends BaseEntity> {
    /* (非 Javadoc)
	* <p>Title: getSession</p>
	* <p>Description: </p>
	* @return
	* @see com.albedo.java.common.persistence.service.impl.IBaseUtilService#getSession()
	*/
    Session getSession();

    /** 强制与数据库同步 */
    void flush();

    /** 清除缓存数据 */
    void clear();

    Query createQuery(String HQL, Object... params);
    SQLQuery createSqlQuery(String SQL, Object... params);

    Object getByHQL(String HQL, boolean isList, List<QueryCondition> conditionList, Object... params);

    Object getByHQL(String HQL, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params);

    List getListSizeByHQL(String HQL, int maxSize, List<QueryCondition> conditionList, Object... params);
    List getListSizeByHQL(String HQL, int maxSize, Object... params);
    List getListByHQL(String HQL, List<QueryCondition> conditionList, Object... params);
    List getListByHQL(String HQL, Object... params);

    List<T> getEntityListByHQL(String HQL, int maxSize, List<QueryCondition> conditionList, Object... params);
    List<T> getEntityListByHQL(String HQL, int maxSize, Object... params);
    List<T> getEntityListByHQL(String HQL, List<QueryCondition> conditionList, Object... params);
    List<T> getEntityListByHQL(String HQL, Object... params);


    Object getObjectByHQL(String HQL, List<QueryCondition> conditionList, Object... params);
    Object getObjectByHQL(String HQL, Object... params);

    T getEntityByHQL(String HQL, List<QueryCondition> conditionList, Object... params);
    T getEntityByHQL(String HQL, Object... params);


    Object getBySQL(String SQL, boolean isList, List<QueryCondition> conditionList, Object... params);
    Object getBySQL(String SQL, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params);

    List getListSizeBySQL(String SQL, int maxSize, List<QueryCondition> conditionList, Object... params);
    List getListSizeBySQL(String SQL, int maxSize, Object... params);
    List getListBySQL(String SQL, List<QueryCondition> conditionList, Object... params);
    List getListBySQL(String SQL, Object... params);

    Object getObjectBySQL(String SQL, List<QueryCondition> conditionList, Object... params);
    Object getObjectBySQL(String SQL, Object... params);

    Boolean doCheckByProperty(T entity);

    Boolean doCheckByPK(T entity);

    int execute(String HQL, Object... params);

    int executeSQL(String SQL, Object... params);

    void executeCall(String call, Object... params);

    public PageModel<?> getHQLPage(String HQL, PageModel<?> pm, Object... params);

    public PageModel<?> getSQLPage(String SQL, PageModel<?> pm, Object... params);

    public PageModel<?> getHQLPage(String HQL, PageModel<?> pm,boolean isCache, Object... params);

    public PageModel<?> getSQLPage(String SQL, PageModel<?> pm,boolean isCache, Object... params);

    Long getCountBySQl(String SQL,Object... params);

    Long getCountByHQL(String HQL,Object... params);


}
