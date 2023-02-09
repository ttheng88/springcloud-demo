package com.liangsy.nocas.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/27
 */
@RestController
public class NocasProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/nacos/provider")
    public String getProvider()
    {
        return "nacos registry, serverPort: "+ serverPort+"\t ";
    }
}
