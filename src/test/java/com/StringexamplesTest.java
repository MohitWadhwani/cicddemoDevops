package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class StringexamplesTest {
	StringexamplesDemo s=new StringexamplesDemo();
	

	@Test
	public void Replace_Test()
	{
		Assertions.assertEquals("Welcome to Devops Bootcamp", s.Replace_Ex());
	}
	
	@Test
	public void testlength()
	{
		Assertions.assertEquals(6, s.length_Ex());
	}
	
	@Test
	public void LowerToUpper()
	{
		Assertions.assertEquals("DEVOPS ENGINEER", s.lower_upper());
	}
	@Test
	public void UpperToLower()
	{
		Assertions.assertEquals("devops engineer", s.upper_lower());
	}
	@Test
	public void Concat_test()
	{
		Assertions.assertEquals("DevopsEngineer",s.concat_Str());
	}
}
