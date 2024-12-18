package Assignments;
import java.util.*;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Input string
        String str = "Sachin Ramesh Tendulkar";
        
        // Create a map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Convert the string to a character array and iterate through it
        for (char c : str.toCharArray()) {
            // Ignore spaces
            if (c != ' ') {
                // Update the frequency count for each character
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        
        // Print the frequency of each character
        System.out.println("Character frequencies in the string:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
