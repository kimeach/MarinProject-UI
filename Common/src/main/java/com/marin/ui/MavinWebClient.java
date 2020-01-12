package com.marin.ui;

import java.util.Collections;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class MavinWebClient implements CreateWebClient{
	@Override
	public WebClient CreateWebClient() {
	    WebClient client = WebClient
                .builder()
                .baseUrl("http://localhost:3020")
                .defaultCookie("admin","admin")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
		return client;
	}
	
}
