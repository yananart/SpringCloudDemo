package com.hundsun.ribbonrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/8/3
 */
@Controller
public class TestController {
    @RequestMapping("//actuator/hystrix.stream")
    public String test(){
        return "redirect:/hystrix.stream";
    }
}
