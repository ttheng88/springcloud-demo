package com.liangsy.zipkin.invoker.controller;

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
public class InvokerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/zipkin/invoker")
    public String paymentZipkin()
    {
//        int i = 10/0;
        return restTemplate.getForObject("http://service-zipkin-provider/zipkin/provider", String.class);
    }
}
