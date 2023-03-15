package com.ghc.cloud.entity;

import lombok.Data;

/**
 * @author 郭昊晨
 * @version 1.0
 * 2023/3/15 /9:45
 */
@Data
public class Result {
    private String code;

    private Object data;

    private Boolean result;
}
