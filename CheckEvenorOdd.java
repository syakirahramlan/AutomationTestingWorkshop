package JavaProgram;
public class CheckEvenorOdd {
	public static void main(String[] args) {
		int number = 20;
		if (isOdd(number)){
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
	}
	}	
	public static boolean isOdd(int num) {
		return (num %2 == 0);
	}
}





