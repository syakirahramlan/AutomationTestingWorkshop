package JavaProgram;
import java.util.Arrays;

public class Arrayexample {

	public static void main(String[] args) {
		int[] array = {11, 20, 39, 51, 15};
        int index = 3;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Deleting the element
        if (index >= 0 && index < array.length) {
            int[] newArray = new int[array.length - 1];
            int newIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }
            array = newArray;
            System.out.println("Array after deletion: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid index to delete.");
        }
    }
}
