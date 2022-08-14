package org.example.repository;

import org.example.config.Config;
import org.example.entity.Capital;
import org.example.entity.Country;

import javax.persistence.EntityManager;

public class CapitalRepository {
    private EntityManager entityManager = Config.getEntityManager();
    public  void saveCapital(Capital capital){
        entityManager.getTransaction().begin();
        entityManager.merge(capital);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
