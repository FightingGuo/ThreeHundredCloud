package com.ghc.cloud.service.impl;

import com.ghc.cloud.entity.Result;
import com.ghc.cloud.entity.Vehicle;
import com.ghc.cloud.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author 郭昊晨
 * @version 1.0
 * 2023/3/15 /10:25
 */
@Service
@Slf4j
public class VehicleServiceImpl implements VehicleService {
    /**
     * 输入的A公司车型信息 获取B公司对应的车型
     *
     * @param vehicle
     * @return
     */
    @Override
    public List<Vehicle> getVehicle(Vehicle vehicle) {
        return null;
    }

    /**
     * 输入的A公司车型信息 获取B公司对应的车型
     */
    public Result getVehicle(String vehicleA) {
        Result result = new Result();
        result.setResult(Boolean.TRUE);
        result.setCode("200");

        if (StringUtils.isEmpty(vehicleA)){
            result.setResult(Boolean.FALSE);
            result.setCode("500");
            result.setData("汽车型号为空");
        }else {
            String temp = null;
            String[] split = vehicleA.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                if (i == 1) {
                    temp = split[i];
                    sb.append(split[i]).append(" ");
                } else if (i == 3) {
                    StringBuilder append = sb.append(temp).append(" ");
                    append.append(split[i]).append(" ");
                } else {
                    sb.append(split[i]).append(" ");
                }
            }
            result.setData(sb);
            log.info("奥迪 奥迪A4L 2015款 50 TFSI quattro 旗舰型 的映射结果为：" + sb);

        }
        return result;
    }
}
