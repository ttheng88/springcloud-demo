package com.liangsy.openFeign.controller;

import com.liangsy.openFeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/21
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;
    @GetMapping("/feignGetUserList")
    public List<String> getUserList(){
        return feignService.getProviderUserList();
    }
}
