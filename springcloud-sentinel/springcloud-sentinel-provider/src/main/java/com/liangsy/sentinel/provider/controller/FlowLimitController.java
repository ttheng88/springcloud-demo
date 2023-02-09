package com.liangsy.sentinel.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/3
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "this is testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "this is testB";
    }


    @GetMapping("/testC")
    public String testC()
    {
        System.out.println("testC 测试异常比例");
        int age = 10/0;
        return "this is testC";
    }


    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testD 测试慢调用比例");
        return "this is testD";
    }



    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "testHotKeyHandler")
    public String testHotKey(@RequestParam(value = "k1",required = false) String k1,
                             @RequestParam(value = "k2",required = false) String k2) {
        //RuntimeException异常 blockHandler管不了，可用fallback处理
//        int i =10 /0;
        return "this is testHotKey";
    }

    public String testHotKeyHandler (String k1, String k2, BlockException exception){
        return "this is testHotKeyHandler，k1="+k1+",k2="+k2;
    }





}
