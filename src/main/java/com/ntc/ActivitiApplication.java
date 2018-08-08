package com.ntc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class ActivitiApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ActivitiApplication.class, args);

		}

	protected SpringApplicationBuilder config(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(ActivitiApplication.class);
	}
}
