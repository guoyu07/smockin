package com.smockin.admin.persistence.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by mgallina.
 */
@Repository
public class MigrationDAOImpl implements MigrationDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Query buildQuery(final String sql) {
        return entityManager.createQuery(sql);
    }

    public Query buildNativeQuery(final String sql) {
        return entityManager.createNativeQuery(sql);
    }

}
