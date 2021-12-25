package com.aaa.controller;

import com.aaa.common.OrderAppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhen.tian
 * @version 1.0 UserController.java  2021/12/25 13:34
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private OrderAppProperties orderAppProperties;

    @RequestMapping(value = "getUserId")
    public String getUserId() {
        return "tom_123";
    }

    @RequestMapping(value = "getOrderApp")
    public String getOrderApp() {
        return orderAppProperties.toString();
    }
}
