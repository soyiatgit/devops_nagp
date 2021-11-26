package com.saurabh.nagp.devops.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DevopsServiceConfiguration {
	
	@Bean(name = "restTemp")
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
