package com.liangsy.sentinel.consumer.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/4
 */
@FeignClient(value = "sentinel-service-provider",fallback = FeginFallbackServiceImpl.class)
public interface FeginService {

    @GetMapping(value = "/provider/{id}")
    String provider(@PathVariable("id") Long id);
}
