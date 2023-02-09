package com.liangsy.hystrix.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@SpringBootApplication
@EnableFeignClients
//@EnableHystrix 调用其他服务时启用
@EnableHystrix
public class HystrixConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerApplication.class,args);
    }
}
