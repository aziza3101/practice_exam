package org.example.repository;

import org.example.config.Config;
import org.example.entity.Capital;
import org.example.entity.Country;

import javax.persistence.EntityManager;
import java.util.List;

public class CountryRepository {
    private  final EntityManager entityManager = Config.getEntityManager();

    public void saveCountry(Country country){
        entityManager.getTransaction().begin();
        entityManager.persist(country);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Country> getAllCountries(){
        entityManager.getTransaction().begin();
        List<Country> countries = entityManager.createQuery("select c from Country c", Country.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return countries;
    }
    public void deleteById(Long id){
        entityManager.getTransaction().begin();
        Country country = entityManager.find(Country.class, id);
        entityManager.remove(country);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public Country update(Long id, Country country){
        entityManager.getTransaction().begin();
        Country country1 = entityManager.find(Country.class,id);
        country1.setName(country.getName());
        entityManager.getTransaction().commit();
        entityManager.close();
        return country1;
    }

}
