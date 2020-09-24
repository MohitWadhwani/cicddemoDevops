package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateService1 {
	@GetMapping ("/sum/{num1}/{num2}")
	public int sum1(@PathVariable int num1,@PathVariable int num2) {
		return (num1+num2);
	}
	@GetMapping ("/subtract/{num1}/{num2}")
	public int subtract1(@PathVariable("num1") int num1,@PathVariable("num2") int num2) {
		return (num1-num2);
	}
	@GetMapping ("/multi/{num1}/{num2}")
	public int multi1(@PathVariable("num1") int num1,@PathVariable("num2") int num2) {
		return (num1*num2);
	}
	@GetMapping ("/divide/{num1}/{num2}")
	public int divide1(@PathVariable int num1,@PathVariable int num2) {
		return (num1/num2);
	}
	@GetMapping ("/modulo /{num1}/{num2}")
	public int modulo1(@PathVariable int num1,@PathVariable int num2) {
		return (num1%num2);
	}
	
}
