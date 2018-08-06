package com.hundsun.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/7/30
 */
@FeignClient(value = "server-hi",fallback = ServiceHystrix.class)
public interface ServiceHi {
    @GetMapping("/hi")
    String sayHi();
}
