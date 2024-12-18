package Assignments;
import java.util.*;

public class Assignment10 {
	// Method to find unique number using Collections
    public static int findUniqueNumber(int[] arr) {
        // Create a map to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each number in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find and return the number that appears exactly once
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        // Return -1 if no unique number is found (in case of an empty array or no unique numbers)
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Input array
        int[] arr = {1, 3, 3, 5, 6, 8, 8, 9};

        // Find the unique number
        int uniqueNumber = findUniqueNumber(arr);

        // Output the result
        System.out.println("Unique number: " + uniqueNumber); // Expected output: 1, 5, or 9 based on the problem setup
	}

}
