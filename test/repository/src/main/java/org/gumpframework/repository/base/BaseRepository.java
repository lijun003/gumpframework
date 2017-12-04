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

    /* (非 Javadoc)
    * <p>Title: clearLevel2Cache</p>
    * <p>Description: </p>
    * @see com.albedo.java.common.persistence.service.impl.IBaseUtilService#clearLevel2Cache()
    */
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


    Object getByQL(String QL, boolean isSql, boolean isCache, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params);

    Boolean doCheckByProperty(T entity);

    Boolean doCheckByPK(T entity);


    /*
     * (非 Javadoc) <p>Title: execute</p> <p>Description: </p>
     * @param HQL
     * @param params
     * @return
     * @see com.albedo.java.common.persistence.service.impl.IBaseUtilService#execute(java.lang.String, java.lang.Object)
     */
    int execute(String HQL, Object... params);

    /*
     * (非 Javadoc) <p>Title: executeSQL</p> <p>Description: </p>
     * @param SQL
     * @param params
     * @return
     * @see com.albedo.java.common.persistence.service.impl.IBaseUtilService#executeSQL(java.lang.String, java.lang.Object)
     */
    int executeSQL(String SQL, Object... params);

    /*
     * (非 Javadoc) <p>Title: executeCall</p> <p>Description: </p>
     * @param call
     * @param params
     * @see com.albedo.java.common.persistence.service.impl.IBaseUtilService#executeCall(java.lang.String, java.lang.Object)
     */
    void executeCall(String call, Object... params);

    public PageModel<?> getHQLPage(String QL, PageModel<?> pm, Object... params);

    public PageModel<?> getSQLPage(String QL, PageModel<?> pm, Object... params);

    public PageModel<?> getHQLPage(String QL, PageModel<?> pm, boolean isCal, boolean isCache, Object... params);

    public PageModel<?> getSQLPage(String QL, PageModel<?> pm, boolean isCal, boolean isCache, Object... params);

    public PageModel<?> getQLPage(String QL, PageModel<?> pm, boolean isSql, boolean isCal, boolean isCache,
                                   Object... params);

    public Long getCountByQL(String QL, boolean isSql, boolean isCache,
                              List<QueryCondition> conditionList, Object... params);
}
