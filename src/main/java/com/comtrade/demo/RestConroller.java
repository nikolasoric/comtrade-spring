package com.comtrade.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestConroller {
	@GetMapping("/hello-rest")
	public String helloWorld() {
		return "Hello World!";
	}
}
