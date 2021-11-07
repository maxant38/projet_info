package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import java.util.List;

public interface HeaterDaoCustom {
    void deleteByHeater(Long id);
    void deleteHeaterInARoom(Long id);
    List<Heater> findHeatersInARoom(Long id);


}
