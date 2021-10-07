package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;

import java.util.List;

public interface BuildingDaoCustom {

    List<Window> findAllWindows(Long id);
    List<Heater> findAllHeaters(Long id);
}
