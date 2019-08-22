package com.github.ming.serverzipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类作用描述
 *
 * @author zhangming
 * @version 1.0
 * @date 2019/5/21 6:03 PM
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hello")
    public String hello(){
        log.info("calling trace service-hi ");
        return "i'm service-hi";
    }

    @RequestMapping("/hi")
    public String hi(){
        log.info("calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/hello", String.class);
    }

//    @Bean
//    public AlwaysSampler defaultSampler(){
//        return new AlwaysSampler();
//    }
}
