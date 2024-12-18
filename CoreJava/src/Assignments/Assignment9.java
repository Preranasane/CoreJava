package Assignments;
import java.util.Arrays;

public class Assignment9 {



	    // Method 2: Without Using Loops (Using Arrays.sort() and Arrays.toString())
	    public static void sortArrayWithoutLoops(int[] arr) {
	        // Sort the array using the built-in sort method
	        Arrays.sort(arr);
	        
	        // Print the sorted array without using loops
	        System.out.println("Sorted array without loops: " + Arrays.toString(arr));
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {1, 5, 2, 8, 9, 4};
	        
	        // Sort and print array without using loops
	        sortArrayWithoutLoops(arr);
	}


}
