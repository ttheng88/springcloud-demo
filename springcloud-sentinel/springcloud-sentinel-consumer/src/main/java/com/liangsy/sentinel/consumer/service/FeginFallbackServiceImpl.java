package com.liangsy.sentinel.consumer.service;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/4
 */
@Component
public class FeginFallbackServiceImpl implements FeginService {
    @Override
    public String provider(Long id) {
        return "服务降级返回,-----FeginFallbackService id="+id;
    }
}
