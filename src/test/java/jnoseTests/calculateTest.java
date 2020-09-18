package jnoseTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import JnoseExampleTests.calculate;

public class calculateTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}


	@Test
	public void test_add() {
		calculate calcule = new calculate();
		int actual = calcule.add(2, 3);
		int expected = 5;				
	}
	
	@Test
	public void test_empty() {
	}
	
}
