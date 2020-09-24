package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/")
public class CalculateService {

	@GetMapping ("/hello")
	public String sayHi() {
		return "Hello!!!";
	}
	@GetMapping ("/sum")
	public int sum_ex() {
		int num1=10;
		int num2=20;
		return num1+num2;
	}
	@GetMapping ("/subtract")
	public int subtract () {
		int num1=10;
		int num2=20;
		return num1-num2;
	}
	@GetMapping ("/multi")
	public int multi () {
		int num1=10;
		int num2=20;
		return num1*num2;
	}
	@GetMapping ("/divide")
	public int divide () {
		int num1=50;
		int num2=10;
		return num1/num2;
	}
	@GetMapping ("/modulo")
	public int modulo() {
		int num1=20;
		int num2=3;
		return num1%num2;
	}
	
}
