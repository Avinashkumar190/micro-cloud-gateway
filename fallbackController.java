package com.lara.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class fallbackController {
	
	@RequestMapping("/orderfallback")
	public Mono<String> orderservicefallback() {
		return Mono.just("order service is taking too long to respond or is  down. pleaae try again later");
		
	}
	
	@RequestMapping("/paymentfallback")
	public Mono<String> paymentservicefallback() {
		return Mono.just("payment service is taking too long to respond or is  down. pleaae try again later");
		
	}

}
