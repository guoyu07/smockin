package com.smockin.admin.persistence.dao;

import com.smockin.admin.persistence.entity.RestfulMock;
import com.smockin.admin.persistence.enums.RecordStatusEnum;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mgallina.
 */
@Repository
public class RestfulMockDAOImpl implements RestfulMockDAOCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void detach(final RestfulMock restfulMock) {
        entityManager.detach(restfulMock);
    }

    @Override
    public List<RestfulMock> findAllByStatus(final RecordStatusEnum status) {
        return entityManager.createQuery("FROM RestfulMock rm WHERE rm.status = :status ORDER BY rm.initializationOrder ASC")
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    public List<RestfulMock> findAll() {
        return entityManager.createQuery("FROM RestfulMock rm ORDER BY rm.initializationOrder ASC")
                .getResultList();
    }

}
