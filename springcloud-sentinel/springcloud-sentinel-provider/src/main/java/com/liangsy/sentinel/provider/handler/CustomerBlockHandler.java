package com.liangsy.sentinel.provider.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author liangsy
 * @desc 自定义兜底异常处理
 * @date 2020/11/4
 */
public class CustomerBlockHandler {
    public static String handlerException(BlockException exception) {
        return "自定义限流处理信息....CustomerBlockHandler.....1";
    }

    public static String handlerException2(BlockException exception) {
        return "自定义限流处理信息....CustomerBlockHandler.....2";
    }
}
