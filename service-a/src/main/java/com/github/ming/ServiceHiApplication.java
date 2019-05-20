package com.github.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient//@EnableEurekaClient 表明自己是一个eurekaclient.
@EnableDiscoveryClient //nacos
public class ServiceHiApplication {


	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}



}
