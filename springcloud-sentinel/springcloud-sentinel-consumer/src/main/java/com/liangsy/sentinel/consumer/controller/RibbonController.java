package com.liangsy.sentinel.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liangsy.sentinel.consumer.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liangsy
 * @desc  熔断演示
 * @date 2020/11/4
 */
@RestController
public class RibbonController {

    private static final String SERVICE_URL = "http://sentinel-service-provider";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/ribbon/consumer/{id}")
//    @SentinelResource(value = "fallback") //没有配置
//    @SentinelResource(value = "fallback",fallback = "handlerFallback") //fallback只负责运行时异常
//    @SentinelResource(value = "fallback",blockHandler = "blockHandler") //blockHandler只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback",fallback = "handlerFallback",blockHandler = "blockHandler",exceptionsToIgnore = {IllegalArgumentException.class})
    public String consumer(@PathVariable Long id) {
        String result = restTemplate.getForObject(SERVICE_URL + "/provider/" + id, String.class, id);
        if (id == 4) {
            throw new IllegalArgumentException ("IllegalArgumentException,非法参数异常....");
        }else if (result.contains("null")) {
            throw new NullPointerException ("NullPointerException,该ID没有对应记录,空指针异常");
        }
        return result;
    }

    public String handlerFallback(@PathVariable  Long id,Throwable e) {
        return "兜底异常handlerFallback,id="+id+",exception内容  "+e.getMessage();
    }

    public String blockHandler(@PathVariable  Long id, BlockException blockException) {
        return "blockHandler-sentinel限流,id="+id+", blockException  "+blockException.getMessage();
    }


}
