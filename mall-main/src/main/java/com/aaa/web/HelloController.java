package com.aaa.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhen.tian
 * @version 1.0 HelloController.java  2021/12/25 13:34
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "getUserId")
    public String getUserId() {
        return "tom_123";
    }

}
