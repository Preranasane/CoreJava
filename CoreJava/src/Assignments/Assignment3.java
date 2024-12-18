package Assignments;
import java.util.regex.*;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Input string
        String str = "I am a good boy";
        
        // Regular expression to match vowels (both lowercase and uppercase)
        String regex = "[aeiouAEIOU]";
        
        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher object to find matches
        Matcher matcher = pattern.matcher(str);
        
        // Variable to keep count of vowels
        int vowelCount = 0;
        
        // Find all matches and count the vowels
        while (matcher.find()) {
            vowelCount++;
        }
        
        // Output the result
        System.out.println("Number of vowels: " + vowelCount);
	}

}
