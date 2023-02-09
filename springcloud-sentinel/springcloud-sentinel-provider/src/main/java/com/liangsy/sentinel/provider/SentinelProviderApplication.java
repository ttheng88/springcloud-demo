package com.liangsy.sentinel.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/3
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SentinelProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelProviderApplication.class, args);
    }
}
