package com;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringexamplesDemo {
	
	@GetMapping("/replace")
	public String Replace_Ex()
	{
		String s="Welcome to which Bootcamp";
			
		return s.replace("which", "Devops");
	}
	@GetMapping("/length")
	public int length_Ex()
	{
		String s="Devops";
				
		return s.length();
	}
	
	
	@GetMapping("/lower")
	public String upper_lower()
	{
		String s="Devops Engineer";
		return s.toLowerCase();
	}
	
	@GetMapping("/upper")
	public String lower_upper()
	{
		String s="Devops Engineer";
		return s.toUpperCase();
	}
	@GetMapping("/concat")
	public String concat_Str()
	{
		String s1="Devops";
		String s2="Engineer";
		return s1.concat(s2);
	}
}
