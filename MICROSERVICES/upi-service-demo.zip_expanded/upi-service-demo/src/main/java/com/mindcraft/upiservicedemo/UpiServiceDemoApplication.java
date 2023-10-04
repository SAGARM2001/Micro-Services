package com.mindcraft.upiservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UpiServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpiServiceDemoApplication.class, args);
	}

	@Bean			//spring container invokes these method
	@LoadBalanced	//configures rest template call to use ribbon:client side load balancer
	public RestTemplate creatTemplate(RestTemplateBuilder builder) {
		return builder.build();		//creates rest template
	}
}
