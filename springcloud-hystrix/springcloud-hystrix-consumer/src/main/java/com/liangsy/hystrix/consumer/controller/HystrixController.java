package com.liangsy.hystrix.consumer.controller;

import com.liangsy.hystrix.consumer.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@RestController
//@DefaultProperties(defaultFallback = "globalTimeOutHandler")
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/consumer/ok")
    public String hystrixOk(){
        String result = hystrixService.hystrixOk();
        System.out.println("*******result:"+result);
        return result;
    }

    @GetMapping("/consumer/timeout")
//    @HystrixCommand(fallbackMethod = "hystrixTimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value =  "3500")
//    })
//    @HystrixCommand
    String hystrixTimeOut(){
        String result = hystrixService.hystrixTimeOut();
        System.out.println("*******result:"+result);
        return result;
    }

    public String hystrixTimeOutHandler(){
        String result = "我是消费者7106，系统繁忙请10秒钟后再试";
        System.out.println("*******result:"+result);
        return result;
    }


    public String globalTimeOutHandler(){
        String result = "抱歉，系统繁忙请10秒钟后再试";
        System.out.println("*******result:"+result);
        return result;
    }
}
