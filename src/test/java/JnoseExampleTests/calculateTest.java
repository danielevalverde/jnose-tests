package JnoseExampleTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

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
	
	@Test
	public void conditional_one() {
		if (true) {
		}	
	}
	
	@Test
	public void conditional_two() {
		for (int i = 0; i < 2; i++) {
		}		
	}
	@Test
	public void conditional_three() {
		int i = 0;
		while (i < 2) {
			i++;
		}
	}
	@Test
	public void conditional_four() {
		int i = 0;
		System.out.println((i <= 2) ? i : 2);
	}
	@Test
	public void conditional_five() {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}	
	}
	@Test
	public void conditional_six() {
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		}		
	}
	@Test
	public void conditional_seven() {
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 2);
	}
	
	@Ignore("testing ignored test")
	public void ignored_test() {
		
	}

	public void ignored_test_two() {
		System.out.println("Runnig a test without @Test");
	}
	
	@Test
	public void expection_one() {
		try {
			throw new Error("oops");
	     }
		finally {
			System.out.println("finally");
		}
	}
	
	@Test
	public void expection_two() {
		try {
			throw new Error("oops");
	     }
		catch(Error e) {
			System.out.println("catch");
		}
	}
	
	@Test
	public void expection_three() {
		try {
			calculate calcule = new calculate();
			caculate("string1", "string2");
	     }
		catch(Error e) {
			System.out.println("You can't pass a string for this method");
		}
	}

}
