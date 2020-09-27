package com.pyt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigClientApplication.class, args);
	}



	@Value("${spring.rabbitmq.host}")
	String foo;


	@Value("${spring.rabbitmq.port}")
	String message;

	@RequestMapping(value = "/hi")
	public String hi(){
		return foo+"------"+message;
	}
}
