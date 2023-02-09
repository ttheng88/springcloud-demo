package com.liangsy.hystrix.provider.controller;

import com.liangsy.hystrix.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/21
 */
@RestController
public class ProviderController {
    @Resource
    private ProviderService providerService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/ok")
    public String hystrixOk(){
        String result = providerService.providerOk();
        System.out.println("*******result:"+result);
        return result;
    }
    @GetMapping("/provider/timeout")
    public String hystrixTimeOut() throws InterruptedException {
        String result = providerService.providerTimeOut();
        System.out.println("*******result:"+result);
        return result;
    }
}
