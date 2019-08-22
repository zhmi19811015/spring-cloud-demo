package com.github.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description  通过@EnableDiscoveryClient向服务中心注册；
 * 并且向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
 * Ribbon 客户端负载均衡
 * @created      2019/2/26 11:20
 * @author      zhangming
 * @version     1.0
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient //nacos
@EnableHystrix   //注解开启Hystrix
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced //负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
