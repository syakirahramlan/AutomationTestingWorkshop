package JavaProgram;

public class arithmeticExceptionHandling {
	
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 0;
		try {
			int result = num1/num2;
			System.out.println("The result of division " + result);
		} catch(ArithmeticException e) {
			System.out.println("Division by zero is not allowed");
	}
	
	}

}
