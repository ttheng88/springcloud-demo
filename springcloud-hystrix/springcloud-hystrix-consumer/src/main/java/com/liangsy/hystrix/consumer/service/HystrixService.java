package com.liangsy.hystrix.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/22
 */
@Component
@FeignClient(value = "hystrix-service-provider",fallback = FallbackServiceImpl.class)
public interface HystrixService {
    @GetMapping("/provider/ok")
    String hystrixOk();
    @GetMapping("/provider/timeout")
    String hystrixTimeOut();
}
