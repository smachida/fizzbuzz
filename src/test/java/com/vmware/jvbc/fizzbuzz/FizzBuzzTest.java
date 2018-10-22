package com.vmware.jvbc.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = null;

	@Before
	public void before() {
		fizzBuzz = new FizzBuzz();
	}
	
	// ここにテストを記述
	
	
	// ここまで
	
	@After
	public void after() {
		fizzBuzz = null;
	}
	
	@Test
	public void testHello() {
		System.out.println("Hello");
	}
//	@Test
//	public void testFizz3() throws Exception {
//		assertEquals("3のときはFizz", "Fizz", fizzBuzz.result(3));
//	}
//	
//	@Test
//	public void testFizz6() throws Exception {
//		assertEquals("6のときはFizz", "Fizz", fizzBuzz.result(6));
//	}	
}
