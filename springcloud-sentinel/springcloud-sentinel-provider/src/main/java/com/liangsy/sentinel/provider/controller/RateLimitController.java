package com.liangsy.sentinel.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.liangsy.sentinel.provider.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/4
 */
@RestController
public class RateLimitController {

    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public String customerBlockHandler()
    {
        return "this is customerBlockHandler";
    }


}
