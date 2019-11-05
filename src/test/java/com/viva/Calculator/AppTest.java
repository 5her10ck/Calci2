package com.viva.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	App app;
	@Before
	public void init() {
		app = new App();
	}
	
	@Test
	public void addTrue() {
		assertEquals(55, app.add(42, 13));
	}
	@Test
	public void addFail() {
		assertNotEquals(32, app.add(15, 7));
	
	}
	@Test
	public void addTrue() {
		assertNotEquals(0, app.add(0, 0));
	
	}
	
	@Test
	public void subTrue() {
		assertEquals(12, app.sub(51, 39));
	}
	@Test
	public void subFail() {
		assertNotEquals(5, app.sub(26, 17));
	}
	@Test
	public void subFail() {
		assertNotEquals(1, app.sub(12, 5));
	}
	
	@Test
	public void mulTrue() {
		assertEquals(45, app.mul(5, 9));
	}
	@Test
	public void mulFail() {
		assertNotEquals(25, app.mul(3, 6));
	}
	
	
	@Test
	public void divTrue() {
		assertEquals(1, app.div(31, 31));
	}
	@Test
	public void divFail() {
		assertNotEquals(1, app.div(56, 7));
	}
	@Test(expected = ArithmeticException.class)
        public void testDivideByZero() {
        int a = 69;
        int b = 0;
        app.div(a, b);
    }
  
}
