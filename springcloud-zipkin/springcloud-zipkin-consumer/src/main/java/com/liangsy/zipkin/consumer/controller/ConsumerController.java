package com.liangsy.zipkin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/zipkin/consumer")
    public String paymentZipkin()
    {
        return restTemplate.getForObject("http://service-zipkin-invoker/zipkin/invoker", String.class);
    }
}
