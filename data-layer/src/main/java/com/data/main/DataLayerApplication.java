package com.data.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableDiscoveryClient
@ComponentScan("com.data")
public class DataLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataLayerApplication.class, args);
	}
}
