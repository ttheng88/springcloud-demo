package com.liangsy.zipkin.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@SpringBootApplication
@EnableEurekaClient
public class ZipkinInvokerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinInvokerApplication.class, args);
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
