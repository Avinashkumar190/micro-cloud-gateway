package com.lara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCloudGatewayApplication.class, args);
	}

}
