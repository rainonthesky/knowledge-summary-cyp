package com.iprobeinfo.diners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsDinersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDinersApplication.class, args);
	}

}
