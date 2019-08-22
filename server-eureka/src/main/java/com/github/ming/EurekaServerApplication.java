package com.github.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启动一个服务注册中心，只需要一个注解@EnableEurekaServer
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
