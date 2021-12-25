package com.aaa.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liuzhen.tian
 * @version 1.0 OrderAppProperties.java  2021/12/25 14:13
 */
@Data
@Component
public class OrderAppProperties {

    @Value("${com.aaa.appId}")
    private String appId;

    @Value("${com.aaa.secret}")
    private String secret;
}
