package com.example.securingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication


public class SecuringWebApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(SecuringWebApplication.class, args);
	}

}
