package com.ghc.cloud.controller;

import com.ghc.cloud.entity.Result;
import com.ghc.cloud.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 郭昊晨
 * @version 1.0
 * 2023/3/15 /10:24
 */
@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/getCar")
    public Result getVehicle(@RequestParam("str") String vehicleA) {
        return vehicleService.getVehicle(vehicleA);
    }

}
