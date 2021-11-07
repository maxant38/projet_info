package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeaterDaoCustomImpl implements HeaterDaoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void deleteByHeater(Long id) {
        String jpql = "delete from Heater h where heater_id = :heater_id";
        em.createQuery(jpql)
                .setParameter("heater_id", id)
                .executeUpdate();
    }

    @Override
    public List<Heater> findHeatersInARoom(Long id) {
        String jpql = "select h from Heater h where h.room.id=:id";
        return em.createQuery(jpql,Heater.class)
                .setParameter("id",id)
                .getResultList();
    }

    @Override
    public void deleteHeaterInARoom(Long id) {
        String jpql = "delete from Heater h where h.room.id=:id";
        em.createQuery(jpql)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public void deleteHeaterInABuilding(Long id) {
        String jpql = "delete h from Heater h where h.room.id=:(from r.id from Room r where r.building.id=:id )";
        em.createQuery(jpql)
                .setParameter("id", id)
                .executeUpdate();
    }

}
