package com.marin.ui;

import java.util.Collections;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

public interface CreateWebClient {
	public WebClient CreateWebClient();
}
