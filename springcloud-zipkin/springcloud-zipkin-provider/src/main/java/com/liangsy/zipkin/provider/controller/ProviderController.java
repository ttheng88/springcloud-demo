package com.liangsy.zipkin.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@RestController
public class ProviderController {
    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/zipkin/provider")
    public String zipkin()
    {
        return "hi ,i'am zipkin, serverPort:"+serverPort;
    }
}
