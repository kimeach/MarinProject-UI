package com.marin.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class CommonFunc {
	
	/*
	 * public RestTemplate restTemplate() { List<HttpMessageConverter<?>> converters
	 * = new ArrayList<HttpMessageConverter<?>>(); converters.add(new
	 * FormHttpMessageConverter()); converters.add(new
	 * StringHttpMessageConverter()); converters.add((HttpMessageConverter<?>) new
	 * MediaType("text", "html")); converters.add((HttpMessageConverter<?>) new
	 * MediaType("application", "json")); converters.add((HttpMessageConverter<?>)
	 * new MediaType("application", "*+json"));
	 * 
	 * RestTemplate rest = new RestTemplate();
	 * rest.setMessageConverters(converters); return rest; }
	 */
	
	/*
	 * public RestTemplate restTemplate() { HttpComponentsClientHttpRequestFactory
	 * factory = new HttpComponentsClientHttpRequestFactory();
	 * factory.setReadTimeout(5000); // 읽기시간초과, ms factory.setConnectTimeout(3000);
	 * // 연결시간초과, ms HttpClient httpClient = HttpClientBuilder.create()
	 * .setMaxConnTotal(100) // connection pool 적용 .setMaxConnPerRoute(5) //
	 * connection pool 적용 .build(); factory.setHttpClient(httpClient); // 동기실행에 사용될
	 * HttpClient 세팅 RestTemplate restTemplate = new RestTemplate(factory);
	 * 
	 * return restTemplate; }
	 */
	
	/*
	 * public WebClient getWebClient() { WebClient client = WebClient .builder()
	 * .baseUrl("http://localhost:3020") .defaultCookie("admin","admin")
	 * .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
	 * .defaultUriVariables(Collections.singletonMap("url",
	 * "http://localhost:3020")) .build(); return client; }
	 */
	
}
