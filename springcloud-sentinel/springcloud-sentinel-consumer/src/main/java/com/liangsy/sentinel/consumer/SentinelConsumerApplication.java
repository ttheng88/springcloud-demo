package com.liangsy.sentinel.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/4
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SentinelConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelConsumerApplication.class, args);
    }
}
