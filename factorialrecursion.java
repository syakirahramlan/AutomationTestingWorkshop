package JavaProgram;

public class factorialrecursion {
	
	public static void main(String[] args) {
		//number in which factorial will be calculated
		int number = 18;
		long factorial = calFactorial(number);
		//print the factorial of the number
		System.out.println("Factorial of " + number + "= " + factorial);
	}
	//Recursive function to calculate factorial
	public static long calFactorial(int num) {
		// Base case: If n is 0 or 1, return 1 (factorial of 0 and 1 is 1)
		if (num == 0 || num == 1 ) {
			return 1;
		}else {
			// Recursive case: If n is greater than 1, call factorial recursively for (n - 1)
			return num*calFactorial(num-1);
		}
	}
}
