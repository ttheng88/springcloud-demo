package com.liangsy.sentinel.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/4
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    private static HashMap<Long, String> hashMap = new HashMap<>();
    static{
        hashMap.put(1L,"11111111111111");
        hashMap.put(2L,"22222222222222");
        hashMap.put(3L,"33333333333333");
    }

    @GetMapping(value = "/provider/{id}")
    public String provider(@PathVariable("id") Long id){
        return hashMap.get(id) + "," + serverPort;
    }
}
