package com.hl.springboot.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Hailin
 * @date 2020/2/4
 */
@SpringBootApplication
        // (exclude = {DataSourceAutoConfiguration.class})
public class DruidApplication {
    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class, args);
    }
}
