package com.ghc.cloud.service;

import com.ghc.cloud.entity.Result;
import com.ghc.cloud.entity.Vehicle;

import java.util.List;

/**
 * @author 郭昊晨
 * @version 1.0
 * 2023/3/15 /10:22
 */
public interface VehicleService {

    /**
     * 输入的A公司车型信息 获取B公司对应的车型
     *
     * @param vehicle
     * @return
     */
    List<Vehicle> getVehicle(Vehicle vehicle);

    /**
     * 输入的A公司车型信息 获取B公司对应的车型
     */
    Result getVehicle(String vehicleA);
}
