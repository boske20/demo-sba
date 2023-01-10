package com.example.demosba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@EnableAdminServer
public class DemoSbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbaApplication.class, args);
	}

}
