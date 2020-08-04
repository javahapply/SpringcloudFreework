package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/sayHello/{word}")
	public String sayHello(@PathVariable("word") String word) {
		
		return "hello"+word;
	}
	
}
