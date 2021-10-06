package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer floor;

    @Column(nullable = false)
    private String name;

    @Column
    private Double currentTemperature;

    @Column
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private Set<Heater> heater;

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    public Room(Long id, Integer power, String name) {
        this.id = id;
        this.floor = power;
        this.name = name;
    }
    public Room(){}

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public String getName() {
        return name;
    }

    public Set<Window> getWindows() { return windows;}

    public Long getId() {
        return this.id;
    }
}
