package com.liangsy.zipkin.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@SpringBootApplication
@EnableEurekaClient
public class ZipkinProvierApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinProvierApplication.class, args);
    }

}
