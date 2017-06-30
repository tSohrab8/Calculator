
public class Calculator {
	
	public double operation(double num1, double num2, int opCode){
		switch(opCode){
			case 1 : return this.addition(num1, num2);
			case 2 : return this.subtraction(num1, num2); 
			case 3 : return this.multiplication(num1,num2); 
			case 4 : return this.division(num1,num2); 
			case 5 : return this.modulus(num1, num2); 
			default : return 0;
		}
	}
	
	private double addition(double num1, double num2){
		return num1 + num2;
	}
	private double subtraction(double num1, double num2){
		return num1 - num2;
	}
	private double multiplication(double num1, double num2){
		return num1 * num2;
	}
	private double division(double num1, double num2){
		return num1 / num2;
	}	
	private double modulus(double num1, double num2){
		return num1 % num2;
	}
	
}
