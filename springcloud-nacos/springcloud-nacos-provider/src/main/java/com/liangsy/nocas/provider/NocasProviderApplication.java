package com.liangsy.nocas.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NocasProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NocasProviderApplication.class,args);
    }
}
