package com.liangsy.hystrix.provider.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/21
 */
@Service
public class ProviderService {
    /**
     * 正常访问
     */
    public String providerOk() {
        return "线程池：" + Thread.currentThread().getName() + "   hystrixOk,  \t" ;
    }

    /**
     * 1.不使用HystrixCommand，高并发情况下会导致providerOk()方法也不可用
     * 2.使用HystrixCommand，服务进行降级，providerOk()可正常使用
     */
    @HystrixCommand(fallbackMethod = "providerTimeOutHandler",commandProperties = {
            //3秒钟以内就是正常的业务逻辑
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value =  "3000")
    })
    public String providerTimeOut() throws InterruptedException {
        int timeNumber = 5;
            TimeUnit.SECONDS.sleep(timeNumber);
        return "线程池：" + Thread.currentThread().getName() + "   hystrixTimeOut,id：  \t" +" 耗时(秒)" + timeNumber;
    }

    public String providerTimeOutHandler(){
        return "线程池："+Thread.currentThread().getName()+"   系统繁忙, 请稍候再试  \t";
    }
}
