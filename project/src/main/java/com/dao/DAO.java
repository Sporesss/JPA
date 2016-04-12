package com.dao;

import com.models.CityEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class DAO {

    EntityManager entityManager = Persistence.
            createEntityManagerFactory("NewPersistenceUnit").createEntityManager();

    public void addCity(CityEntity cityEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(cityEntity);
        transaction.commit();
    }

    public List<CityEntity> getAllCityList() {
        return entityManager.
                createQuery("SELECT city_alias FROM CityEntity city_alias")
                .getResultList();
    }
}
