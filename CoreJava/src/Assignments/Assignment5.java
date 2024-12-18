package Assignments;
import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input array
        int[] arr = {1, 3, 3, 5, 6, 8, 8, 9};
        
        // Step 1: Use a Map to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Populate the Map with the count of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Iterate over the map and print numbers that occur exactly once
        System.out.print("Non-repeated numbers: ");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
	}

	}
}
