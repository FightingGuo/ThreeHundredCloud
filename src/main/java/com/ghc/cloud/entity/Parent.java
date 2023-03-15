package com.ghc.cloud.entity;

import lombok.Data;

/**
 * @Date 2023/3/15 /17:20
 * @Author guohc
 * @Description
 */
@Data
public class Parent {
    private Long id;

    private Long parentId;

    private String vehicleName;
}
