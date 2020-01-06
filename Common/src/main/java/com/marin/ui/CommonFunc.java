package com.marin.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommonFunc {
	
	public RestTemplate restTemplate() {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
	    converters.add(new FormHttpMessageConverter());
	    converters.add(new StringHttpMessageConverter());
	    converters.add((HttpMessageConverter<?>) new MediaType("text", "html"));
	    converters.add((HttpMessageConverter<?>) new MediaType("application", "json"));
	    converters.add((HttpMessageConverter<?>) new MediaType("application", "*+json"));
	    
	    RestTemplate rest = new RestTemplate();
	    rest.setMessageConverters(converters);
	    return rest;
	}
}
