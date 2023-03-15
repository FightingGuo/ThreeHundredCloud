package com.ghc.cloud.entity;

import lombok.Data;

/**
 * @author 郭昊晨
 * @version 1.0
 * 2023/3/15 /9:30
 */
@Data
public class Vehicle {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 汽车名称
     */
    private String parentName;

    /**
     * 汽车名称
     */
    private String vehicleName;

    /**
     * 汽车型号(A4L)
     */
    private String vehicleType;

    /**
     * 年份款式(2019款)
     */
    private String yearStyle;

    /**
     * 百公里加速数值(40)
     */
    private String accelerationCount;

    /**
     * 百公里加速单位(TFSI)
     */
    private String accelerationUnit;

    /**
     * 操作类型(自动/手动)
     */
    private String operationType;

    /**
     * 汽车类型(舒适/典藏)
     */
    private String vehicleStyle;


    @Override
    public String toString() {
        return "Vehicle{" +
                parentName + " " +
                vehicleName + " " +
                vehicleType + " " +
                 yearStyle  + " " +
                vehicleType + " " +
                accelerationCount + " " +
                accelerationUnit + " " +
                 operationType + " " +
                vehicleStyle + " " +
                "}";
    }
}
