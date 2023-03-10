package com.liangsy.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/27
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(NacosConsumerApplication.class,args);
    }

}
