package com.hundsun.feign;

import org.springframework.stereotype.Component;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/8/6
 */
@Component
public class ServiceHystrix implements ServiceHi {
    @Override
    public String sayHi() {
        return "访问服务失败";
    }
}
