package com.ghc.cloud.mapper;

import com.ghc.cloud.entity.Vehicle;

import java.util.List;

/**
 * @author 郭昊晨
 * @version 1.0
 * 2023/3/15 /10:00
 */
public interface VehicleMapper {
    List<Vehicle> getVehicle(Vehicle vehicle);
}
