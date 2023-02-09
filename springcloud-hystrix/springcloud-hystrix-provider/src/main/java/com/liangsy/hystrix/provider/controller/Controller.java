package com.liangsy.hystrix.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangsy
 * @desc 控制类
 * @date 2020/10/20
 */
@RestController
public class Controller {

    @Value("${server.port}")
    private int port;

    @GetMapping("/getUserList")
    public List<Object> getUserList() {
        List<Object> listUser = new ArrayList<>();
        listUser.add("端口号："+port);
        listUser.add("zhangsan");
        listUser.add("lisi");
        return listUser;
    }


}
