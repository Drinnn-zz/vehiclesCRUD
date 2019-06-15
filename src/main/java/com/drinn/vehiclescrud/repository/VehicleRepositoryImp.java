package com.drinn.vehiclescrud.repository;

import com.drinn.vehiclescrud.domain.Vehicle;

import java.util.List;

public interface VehicleRepositoryImp {
    Vehicle save(Vehicle vehicle);

    Vehicle getById(Integer vehicleId);

    void delete(Integer vehicleId);

    void update(Vehicle vehicle);

    List<Vehicle> getAll();
}
