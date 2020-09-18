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
	public void default_Test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void default_test_2() throws InterruptedException {
		/* following the example on https://testsmells.github.io/pages/testsmellexamples.html#DefaultTest*/
		calculate calcule = new calculate();
		int actual = calcule.add(2, 3);
		int expected = 2;
		assertEquals(expected,actual);
	}
	
	public void default_test_3() throws Exception {
		/* following the example on https://testsmells.github.io/pages/testsmellexamples.html#DefaultTest*/
		calculate calcule = new calculate();
		int actual = calcule.add(2, 3);
		int expected = 2;
		assertEquals(4, 2 + 2);
	}

	@Test
	public void unknown_test() {
		calculate calcule = new calculate();
		int actual = calcule.add(2, 3);
		int expected = 5;				
	}
	
	@Test
	public void empty_test() {
	}
	
	@Test
	public void print_statement_one() {
		System.out.println("test with println");
	}
	
	@Test
	public void print_statement_two() {
		int a = 1;
		int b = 2;
		System.out.printf("test with printf = %d",(a + b));
	}
	
	@Test
	public void print_statement_three() {
		System.out.print("test with print");
	}


}
