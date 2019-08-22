package com.github.ming;

import com.github.ming.filter.RequestTimeGatewayFilterFactory;
import com.github.ming.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}


	@Bean
	public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
		return new RequestTimeGatewayFilterFactory();
	}

	@Bean
	public TokenFilter tokenFilter(){
		return new TokenFilter();
	}
}
