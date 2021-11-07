INSERT INTO BUILDING(id, name) VALUES(-12, 'Building1');
INSERT INTO BUILDING(id, name) VALUES(-11, 'Building1');
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id)  VALUES(-10, 'Room1', 1, 22.3, 20.0,-12);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id)  VALUES(10, 'Room2', 1, 2, 21,-11);

INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-10, 'ON', 'Heater1', 2000, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-9, 'ON', 'Heater2', null, -10);

INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(100, 'ON', 'Heater3', 2000, 10);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(223, 'OFF', 'Heater4', null, 10);


INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-10, 'CLOSED', 'Window 1', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-9, 'CLOSED', 'Window 2', -10);

INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-8, 'CLOSED', 'Window 3', 10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-7, 'OPEN', 'Window 4', 10);