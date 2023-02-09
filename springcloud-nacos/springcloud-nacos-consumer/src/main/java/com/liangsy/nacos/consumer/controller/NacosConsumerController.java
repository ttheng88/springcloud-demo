package com.liangsy.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/27
 */
@RestController
public class NacosConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping(value = "/nacos/consumer")
    public String getConsumer()
    {
        return restTemplate.getForObject(serverUrl +"/nacos/provider",String.class);
    }
}
