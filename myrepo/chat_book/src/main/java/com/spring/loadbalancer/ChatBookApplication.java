package com.spring.loadbalancer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/request")
public class ChatBookApplication {

	@Value("${server.port}")
	String port;

	@GetMapping("/port")
	public String getPort(){
		return"port no is"+port;
	}
	public static void main(String[] args) {
		SpringApplication.run(ChatBookApplication.class, args);
	}

}