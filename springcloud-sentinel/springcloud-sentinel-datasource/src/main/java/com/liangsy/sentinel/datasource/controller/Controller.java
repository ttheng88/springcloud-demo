package com.liangsy.sentinel.datasource.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author liangsy
 * @desc
 * @date 2020/11/5
 */
@RestController
public class Controller {

    /**
     * 资源配置 推荐配flow，不推荐配/datasource/flow
     */
    @GetMapping("/datasource/flow")
    @SentinelResource(value = "flow", blockHandler = "myBlockHandler")
    public String flow() {
        return "this is datasource flow";
    }

    @GetMapping("/datasource/degrade")
    @SentinelResource(value = "degrade",blockHandler = "myBlockHandler")
    public String degrade() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1L);
        return "this is datasource degrade";
    }

    @GetMapping("/datasource/paramFlow")
    @SentinelResource(value = "paramFlow",blockHandler = "paramFlowHandler")
    public String testHotKey(@RequestParam(value = "k1",required = false) String k1,
                             @RequestParam(value = "k2",required = false) String k2) {
        return "this is datasource param-flow";
    }

    /**
     * 必须传入 BlockException
     */
    public String myBlockHandler(BlockException exception){
        return "服务器繁忙，请稍后再试";
    }

    /**
     * 必须传入k1，k2，BlockException
     */
    public String paramFlowHandler (String k1, String k2, BlockException exception){
        return "this is datasource paramFlowHandler，k1="+k1+",k2="+k2;
    }

}
