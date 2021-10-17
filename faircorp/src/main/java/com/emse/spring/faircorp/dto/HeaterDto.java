package com.emse.spring.faircorp.dto;

import com.emse.spring.faircorp.model.*;

public class HeaterDto {

    private Long id;
    private String name;
    private HeaterStatus heaterStatus;
    private String roomName;
    private Long roomId;

    public HeaterDto(Room room){}
    public HeaterDto(){}
    public HeaterDto(Heater heater) {
        this.id = heater.getId();
        this.name = heater.getName();
        this.heaterStatus = heater.getHeaterStatus();
        this.roomName = heater.getRoom().getName();
        this.roomId = heater.getRoom().getId();
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatusStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public String getRoomName() {
        return roomName;
    }


    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }






}
