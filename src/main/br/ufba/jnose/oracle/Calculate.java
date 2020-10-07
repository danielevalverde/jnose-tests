package br.ufba.jnose.oracle;

public class Calculate {
	
	public int initial_value;
	public String state;
	
	public Calculate(String state) {
		initial_value = 0; 
		this.state = state;
	}
	
	public String turnOn() {
		this.state = "on";
		return "Turn On";
	}
	
	public String turnOff() {
		this.state = "off";
		return "Turn Off";
	}
	
	public int add( int a, int b) {
		return a + b;
	}
	
	public int sub( int a, int b) {
		return a - b;
	}
	
	public int div(int num1,int num2){
		return num1 / num2;
	}
	
	public int mult(int num1, int num2){
		return num1 * num2;
	}

}
