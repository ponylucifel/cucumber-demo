package com.ponylucifel.spring.cucumberdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CucumberDemoController {

	@GetMapping("rest/demo/hello")
	public String getHello() {
		return "Hello, world";
	}
	
	@GetMapping("rest/demo/{someWord}")
	public String getSomeWord(@PathVariable("someWord") String someWord) {
		return someWord;
	}
}
