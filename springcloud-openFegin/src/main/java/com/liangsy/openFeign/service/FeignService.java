package com.liangsy.openFeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/21
 */
@FeignClient("service-provider")
public interface FeignService {
    @RequestMapping("/getUserList")
    List<String> getProviderUserList();

}
