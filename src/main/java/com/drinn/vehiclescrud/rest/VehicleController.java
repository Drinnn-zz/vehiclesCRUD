package com.drinn.vehiclescrud.rest;

import com.drinn.vehiclescrud.applicationService.VehicleApplicationService;
import com.drinn.vehiclescrud.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("vehicle")
@RestController
public class VehicleController {
    @Autowired
    private VehicleApplicationService _appService;

    @PostMapping("")
    public Vehicle save(@RequestBody Vehicle vehicle){
        return _appService.save(vehicle);
    }

    @GetMapping("{vehicleId}")
    public Vehicle getById(@PathVariable(name = "vehicleId") Integer vehicleId){
        return _appService.getById(vehicleId);
    }

    @PutMapping()
    public void update(@RequestBody Vehicle vehicle){
        _appService.update(vehicle);
    }

    @DeleteMapping("{vehicleId}")
    public void delete(@PathVariable(name = "vehicleId") Integer vehicleId){
        _appService.delete(vehicleId);
    }

    @GetMapping("/getAll")
    public List<Vehicle> getAll(){
        return _appService.getAll();
    }
}
