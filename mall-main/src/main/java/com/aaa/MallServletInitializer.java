package com.aaa;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * mall Web程序启动类
 *
 * @author liuzhen.tian
 * @version 1.0 MallServletInitializer.java  2021/12/25 14:01
 */
public class MallServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
