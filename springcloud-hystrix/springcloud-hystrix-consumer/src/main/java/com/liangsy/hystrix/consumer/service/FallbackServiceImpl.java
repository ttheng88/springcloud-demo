package com.liangsy.hystrix.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@Component
public class FallbackServiceImpl implements HystrixService {
    @Override
    public String hystrixOk() {
        String result = "我是hystrixOk，系统繁忙请10秒钟后再试";
        System.out.println("*******result:"+result);
        return result;
    }

    @Override
    public String hystrixTimeOut() {
        String result = "我是hystrixTimeOut，系统繁忙请10秒钟后再试";
        System.out.println("*******result:"+result);
        return result;
    }
}
