package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class CalculateServiceTest {
CalculateService c=new CalculateService();

@Test()
public void add_test()
{
	Assertions.assertEquals(30,c.sum_ex());	
}
@Test()
public void subtract_test()
{
	Assertions.assertEquals(-10,c.subtract());
	
}
@Test()
public void multi_test()
{
	Assertions.assertEquals(200,c.multi());
	
}
@Test()
public void divide_test()
{
	Assertions.assertEquals(5,c.divide());
	
}
@Test()
public void modulo_test()
{
	Assertions.assertEquals(2,c.modulo());
	
}
}
