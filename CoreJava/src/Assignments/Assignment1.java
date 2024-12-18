package Assignments;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Input array
        int[] arr = {1, 4, 8, 15, 17, 23, 34, 22, 45, 46, 72, 200};

        // Step 1: Convert the array to an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Step 2: Sort the list in ascending order
        Collections.sort(list);

        // Step 3: Find the maximum difference between adjacent numbers
        int maxDiff = 0;
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            maxDiff = Math.max(maxDiff, diff);
        }

        // Output the result
        System.out.println("Maximum difference between adjacent numbers: " + maxDiff);
		
	}

}
