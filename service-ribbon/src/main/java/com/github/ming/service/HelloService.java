package com.github.ming.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 在hiService方法上加上@HystrixCommand注解。
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串，字符串为"hi,"+name+",sorry,error!"
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        //两种都可以，第二参数返回类型
        //return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
        //参数 url 返回对象  参数
        return restTemplate.getForEntity("http://service-a/test/hi?name={1}",String.class,name).getBody();
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
