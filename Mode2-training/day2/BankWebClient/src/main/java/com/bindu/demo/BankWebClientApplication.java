package com.bindu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BankWebClientApplication implements WebMvcConfigurer{
	
	
	public static final String USER_SERVICE_URL = "http://Bank-UserService";


	public static void main(String[] args) {
		SpringApplication.run(BankWebClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	       
	@Bean
	public ClientUserService clientUserService(){
		return (ClientUserService) new RemoteUserRepository(USER_SERVICE_URL);
	}


}
