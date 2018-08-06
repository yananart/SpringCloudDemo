package com.hundsun.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/7/30
 */
@RestController
public class TestController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi() {
        return schedualServiceHi.sayHiFromClientOne();
    }
}
