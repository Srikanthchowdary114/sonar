package com.amazon.market.product;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	

		@Bean @LoadBalanced
		RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}

