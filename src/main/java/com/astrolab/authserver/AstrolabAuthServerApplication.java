package com.astrolab.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AstrolabAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstrolabAuthServerApplication.class, args);
	}

}

