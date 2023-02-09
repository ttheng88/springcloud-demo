package com.liangsy.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/20
 */
@RestController
public class Service {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbonGetUserList")
    public List getUserList() {
        return restTemplate.getForObject("http://service-provider/getUserList", List.class);
    }

}
