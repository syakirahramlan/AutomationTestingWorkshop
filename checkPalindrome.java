package JavaProgram;

public class checkPalindrome {

	public static void main(String[] args) {
	 String word = "mother";
	 
	 if (isPalindrome(word)) {
		 System.out.println("'" + word + "' is a Palindrome");
	 } else {
		 System.out.println("'" + word + "' is not a Palindrome");
	 }
	}
	
	public static boolean isPalindrome(String word) {
		int left = 0;
		int right =word.length()-1;
		
		while (left<right) {
			if(word.charAt(left)!= word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	}

