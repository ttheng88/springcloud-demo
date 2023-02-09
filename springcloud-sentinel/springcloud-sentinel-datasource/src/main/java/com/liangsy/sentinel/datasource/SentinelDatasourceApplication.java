package com.liangsy.sentinel.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/5
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelDatasourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelDatasourceApplication.class, args);
    }
}
