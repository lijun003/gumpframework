package org.gumpframework.repository.impl;

import org.gumpframework.domain.base.BaseEntity;
import org.gumpframework.repository.BaseRepository;
import org.gumpframework.util.LogUtil;
import org.gumpframework.util.bean.PageModel;
import org.gumpframework.util.bean.QueryCondition;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    public Query createQuery(String HQL, Object... params) {
        return null;
    }

    @Override
    public SQLQuery createSqlQuery(String SQL, Object... params) {
        return null;
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


    @Override
    public Object getByQL(String QL, boolean isSql, boolean isCache, boolean isList, int maxSize, List<QueryCondition> conditionList, Object... params) {

        return null;
    }
}
