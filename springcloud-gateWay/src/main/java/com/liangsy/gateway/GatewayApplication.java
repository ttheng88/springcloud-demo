package com.liangsy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.ZonedDateTime;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/21
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
    public static void main(String[] args) {
        System.out.println("ZonedDateTime.now()=============="+ZonedDateTime.now());
        SpringApplication.run( GatewayApplication.class,args);
    }
}
