package com.hundsun.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/7/30
 */
@FeignClient("server-hi")
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne();
}
