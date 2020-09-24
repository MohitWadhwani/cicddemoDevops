package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class CalculateService1Test {
	CalculateService1 c=new CalculateService1();
	@Test()
	public void add_test()
	{
		int a=10,b=20;
		Assertions.assertEquals(c.sum1(a,b),30);	
	}
	@Test()
	public void subtract_test()
	{
		int a=10,b=20;
		Assertions.assertEquals(c.subtract1(a,b),-10);
		
	}
	@Test()
	public void multi_test()
	{
		int a=10,b=20;
		Assertions.assertEquals(c.multi1(a,b),200);
		
	}
	@Test()
	public void divide_test()
	{
		int a=50,b=10;
		Assertions.assertEquals(c.divide1(a,b),5);
		
	}
	@Test()
	public void modulo_test()
	{
		int a=12,b=10;
		Assertions.assertEquals(c.modulo1(a,b),2);
		
	}
}
