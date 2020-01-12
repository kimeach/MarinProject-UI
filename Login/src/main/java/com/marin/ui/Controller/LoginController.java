package com.marin.ui.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.marin.ui.CommonFunc;
import com.marin.ui.CreateWebClient;

import reactor.core.publisher.Flux;




@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	CreateWebClient client;
	
	@GetMapping
	public ModelAndView getLogin() {
		return new ModelAndView("LoginIndex");
	}
	
	@PostMapping
	@ResponseBody
	public  String Login(@RequestBody String param,HttpServletRequest request) {
		System.out.println("들어온 값 : "+param);
		
	    WebClient wc = client.CreateWebClient();
	    
	    
	    Map<String,Object> tm = new HashMap<String, Object>();
	    tm.put("aa","bb");
	    tm.put("bb","d");
	    tm.put("cc","dss");
	    
	    WebClient.RequestHeadersSpec<?> req2 = wc.post()
                .uri("/marin/Login")
                .body( BodyInserters.fromFormData("aa","bb"));
	    
	    
		

	    
	   
	    
		Flux<List> responseValue = req2.retrieve().bodyToFlux(List.class);	    
		System.out.println("들어온 값 : "+responseValue.log());
		
		return "";
	}
}
