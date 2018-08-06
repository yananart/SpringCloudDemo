package com.hundsun.ribbonrest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/7/30
 */
@Service
public class TestService {

    private RestTemplate restTemplate;

    @Autowired
    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return restTemplate.getForObject("http://SERVER-HI/hi",String.class);
    }

    public String hiError() {
        return "hi, sorry, it's error!";
    }
}
