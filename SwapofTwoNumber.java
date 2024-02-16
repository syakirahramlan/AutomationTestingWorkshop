package JavaProgram;

public class SwapofTwoNumber {
	public static void main(String[] args) {
	  // Define two numbers
	  int number1 = 3;
	  int number2 = 15;
	  
	  // Display The number before swapping
	  System.out.println("Before swapping:");
	  System.out.println("Number 1 = " + number1);
	  System.out.println("Number 2 = " + number2);

	  // Swapping the numbers 
	  number1 = number1 + number2;
	  number2 = number1 - number2;
	  number1 = number1 - number2;

	  // Display numbers after swapping
	  System.out.println("After swapping:");
	  System.out.println("Number 1 = " + number1);
	  System.out.println("Number 2 = " + number2);
	}
}


