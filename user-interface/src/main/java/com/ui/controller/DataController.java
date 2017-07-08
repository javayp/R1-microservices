package com.ui.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}
	public Map<Integer,String> read(){
		//ResponseEntity<Map<Integer,String>> response=restTemplate.getForEntity("url", "responseType");
		return null;
	}
}
