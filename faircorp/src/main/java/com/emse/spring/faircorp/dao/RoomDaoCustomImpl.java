package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class RoomDaoCustomImpl implements RoomDaoCustom {

    @PersistenceContext
    private EntityManager em;

    public List<Room> findRoom(Long id) {
        String jpql = "select w from Room where id = :id";
        return em.createQuery(jpql, Room.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public List<Heater> findRoomHeaters(Long id) {
        String jpql="select h from Heater h where h.room.id=:id";
        return em.createQuery(jpql, Heater.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public List<Window> findRoomWindows(Long id) {
        String jpql="select w from Window w where w.room.id=:id";
        return em.createQuery(jpql, Window.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public void deleteRoomInABuilding(Long id) {
        String jpql = "delete from Room r where r.building.id=:id";
        em.createQuery(jpql)
                .setParameter("id", id)
                .executeUpdate();


    }




}