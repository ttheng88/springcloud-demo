package com.liangsy.sentinel.consumer.controller;

import com.liangsy.sentinel.consumer.service.FeginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/4
 */
@RestController
public class FeginController {

    @Resource
    private FeginService feginService;

    @GetMapping(value = "/fegin/consumer/{id}")
    public String consumer(@PathVariable Long id) {
        return feginService.provider(id);
    }
}
