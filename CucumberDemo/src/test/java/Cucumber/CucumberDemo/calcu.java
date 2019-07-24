package Cucumber.CucumberDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcu {

	@Test
	public void test() {
		Calculator c= new Calculator();
		
		assertEquals(10, c.add(4, 6));
	}

}
