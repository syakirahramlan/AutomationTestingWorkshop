package JavaProgram;

public class minMax {
	
	public static void main(String[] args) {
		//declare the array and values of it
		int[] array = {12, 200, 35, 40, 15, 63} ;
		int max = findMax(array); 
		int min = findMin(array); 
		//Display the maximum element and minimum element
		System.out.println("Maximum Element: " + max);
	    System.out.println("Minimum Element: " + min);
	}
	//Function to find max element
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] > max) {
		     max = arr[i];
		   }
		}
		return max;
	}

	// Function to find the min element in the array
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] < min) {
		      min = arr[i];
		    }
		}
		return min;
	}
	}
