package com.drinn.vehiclescrud.applicationService;

import com.drinn.vehiclescrud.domain.Vehicle;
import com.drinn.vehiclescrud.repository.VehicleRepositoryImp;
import com.drinn.vehiclescrud.unitOfWork.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleApplicationService implements VehicleRepositoryImp {

    @Autowired
    private VehicleRepository _uow;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return _uow.save(vehicle);
    }

    @Override
    public Vehicle getById(Integer vehicleId) {
        return _uow.getOne(vehicleId);
    }

    @Override
    public void delete(Integer vehicleId) {
        _uow.deleteById(vehicleId);
    }

    @Override
    public void update(Vehicle vehicle) {
        _uow.saveAndFlush(vehicle);
    }

    @Override
    public List<Vehicle> getAll() {
        return _uow.findAll();
    }
}
