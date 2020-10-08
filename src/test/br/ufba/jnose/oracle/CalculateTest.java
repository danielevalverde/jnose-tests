package br.ufba.jnose.oracle;

import br.ufba.jnose.oracle.Calculate;  
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculateTest {
	
	@Before
	public void setUp() throws Exception {
		String state = "on";
	}
	private Calculate calc;
	
	public CalculateTest() {
		calc = new Calculate("off");
	}
		
	@Test
	public void should_be_default_Test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void should_be_default_test_2() throws InterruptedException {
		/* following the example on https://testsmells.github.io/pages/testsmellexamples.html#DefaultTest*/
		Calculate calcule = new Calculate("on");
		int actual = calcule.add(2, 3);
		int expected = 5;
		assertEquals(expected,actual);
	}
	
	@Test
	public void should_be_default_test_3() throws Exception {
		/* following the example on https://testsmells.github.io/pages/testsmellexamples.html#DefaultTest*/
		Calculate calcule = new Calculate("on");
		int actual = calcule.add(2, 3);
		int expected = 2;
		assertEquals(4, 2 + 2);
	}

	@Test
	public void should_be_unknown_test() {
		Calculate calcule = new Calculate("on");
		int actual = calcule.add(2, 3);		
	}
	
	@Test
	public void should_be_empty_test() {
	}
	
	@Test
	public void should_be_print_statement_one() {
		System.out.println("test with println");
	}
	
	@Test
	public void should_be_print_statement_two() {
		int a = 1;
		int b = 2;
		System.out.printf("test with printf = %d",(a + b));
	}
	
	@Test
	public void should_be_print_statement_three() {
		System.out.print("test with print");
	}
	
	@Test
	public void should_be_conditional_one() {
		if (true) {
		}	
	}
	
	@Test
	public void should_be_conditional_two() {
		for (int i = 0; i < 2; i++) {
		}		
	}
	
	@Test
	public void should_be_conditional_three() {
		int i = 0;
		while (i < 2) {
			i++;
		}
	}
	
	@Test
	public void should_be_conditional_four() {
		int i = 0;
		System.out.println((i <= 2) ? i : 2);
	}
	@Test
	public void should_be_conditional_five() {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}	
	}
	@Test
	public void should_be_conditional_six() {
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
	public void should_be_conditional_seven() {
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
	@Ignore @Test
	public void should_be_ignored_test_two() {
		System.out.println("Runnig a test without @Test");
	}
	
	@Test @Ignore 
 	public void should_be_ignored_test_three() {
		System.out.println("Runnig a test without @Test");
	}
	
	@Test
	public void should_be_expection_one() {
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
	public void should_not_be_eager_test() {
		Calculate calcule = new Calculate("on");
		assertEquals(calcule.turnOn(),"");
		assertThat(calcule.turnOn(), is(""));
	}
	
	@Test
	public void should_be_eager_test() {
		Calculate calcule = new Calculate("off");
		assertThat(calcule.turnOn(), is("Turn On"));
		assertThat(calcule.turnOn(), is("Turn On"));
	}
	
	@Test
	public void should_not_be_eager_test_two() {
		Calculate calcule = new Calculate("on");
		assertEquals(calcule.turnOn(),"Turn On");
		assertEquals(calcule.turnOff(),"Turn Off");
	}
	
	@Test
	public void should_be_lazy_test() {
		Calculate calcule = new Calculate("on");
		assertEquals(calcule.add(3, 5),calcule.add(3, 5));
		assertEquals(calcule.add(2, 5),calcule.add(2, 5));
	}
	
	@Test
	public void should_be_lazy_test_two() {
		Calculate calcule = new Calculate("on");
		int count_one = calcule.add(3, 5)+ calcule.add(3, 5);
		int count_two = calcule.add(3, 5)+ calcule.add(3, 5);
		assertEquals(count_one, count_two);
	}
	
	@Test
	public void should_be_assertion_roulette() {
		// and duplicate assert
		Calculate calcule = new Calculate("on");
		assertEquals(calcule.turnOn(),"Turn On");
		assertEquals(calcule.turnOff(),"Turn Off");
		assertEquals(calcule.turnOff(),"Turn Off");
	}
	
	@Test
	public void should_be_duplicate_assert() {
		assertEquals("","");
		assertEquals("","");
		assertEquals("","");
		assertEquals("","");
		assertEquals("","");
	}
	
	@Test
	public void should_be_construct_initialization() {
		assertEquals(calc.turnOn(),"Turn On");
	}
	
	@Test
	public void should_be_mistery_number() {
		assertEquals(calc.add(2, 3),5);
	}
	
	@Test
	public void should_be_mistery_number_two() {
		int value = 5;
		assertEquals(calc.add(2, 3),value);
	}

	private Matcher is(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	public void should_be_Mistery_Guest() throws IOException{
	    File tempFile = File.createTempFile("test", ".txt");
	}
	
	@Test
	public void should_be_resource_optimism() throws Exception {
		File file = new File( "file.txt" );
	    FileWriter fw = new FileWriter( file );
	    fw.write("my text");
	    fw.close();
	    file.delete();
	}
	
	@Test
	public void should_not_be_resource_optimism() throws Exception {
		File file = new File( "file.txt" );
	    if(file.exists()) {
	    	FileWriter fw = new FileWriter( file );
	    	fw.write("my text");
	    }
	}

	
	@Test
	public void should_be_redundant_assertion() {
	    assertEquals(true, true);
	}
	
	@Test
	public void should_be_redundant_assertion_two() {
	    assertEquals(false, false);
	}
	
	@Test
	public void should_be_sensitive_equality() {
		String str = "my string"; 
		assertEquals(str.toString(), "my string");
	}

}
