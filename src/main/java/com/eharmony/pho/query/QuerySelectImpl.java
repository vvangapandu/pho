package com.eharmony.pho.query;

import java.util.List;

import com.eharmony.pho.query.criterion.Criterion;
import com.eharmony.pho.query.criterion.Orderings;

/**
 * The default implementation of the generic Query interface
 * 
 * @param <T>
 *            the entity type being queried
 * @param <R>
 *            the desired return type
 */
public class QuerySelectImpl<T, R> implements QuerySelect<T, R> {

    private final Class<T> entityClass;
    private final Class<R> returnType;
    private final Criterion criteria;
    private final Orderings orderings;
    private final Integer maxResults;
    private final List<String> returnFields;
    private final QueryOperationType queryOperationType;

    public QuerySelectImpl(Class<T> entityClass, Class<R> returnType, Criterion criteria, Orderings orderings,
            Integer maxResults, List<String> returnFields, QueryOperationType queryOperationType) {
        this.entityClass = entityClass;
        this.returnType = returnType;
        this.criteria = criteria;
        this.returnFields = returnFields;
        this.orderings = orderings;
        this.maxResults = maxResults;
        this.queryOperationType = queryOperationType;
    }

    public QueryOperationType getQueryOperationType() {
        return queryOperationType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eharmony.matching.seeking.query.Query#getEntityClass()
     */
    public Class<T> getEntityClass() {
        return entityClass;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eharmony.matching.seeking.query.Query#getReturnType()
     */
    public Class<R> getReturnType() {
        return returnType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eharmony.matching.seeking.query.Query#getReturnFields()
     */
    public List<String> getReturnFields() {
        return returnFields;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eharmony.matching.seeking.query.Query#getCriteria()
     */
    public Criterion getCriteria() {
        return criteria;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eharmony.matching.seeking.query.Query#getOrder()
     */
    @Override
    public Orderings getOrder() {
        return orderings;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.eharmony.matching.seeking.query.Query#getMaxResults()
     */
    @Override
    public Integer getMaxResults() {
        return maxResults;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "QueryImpl [entityClass=" + entityClass + ", criteria=" + criteria + ", orderings=" + orderings
                + ", maxResults=" + maxResults + "]";
    }
}
