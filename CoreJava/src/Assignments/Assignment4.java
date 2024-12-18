package Assignments;
import java.util.regex.*;

public class Assignment4 {

	 // Method to validate email
    public static boolean isValidEmail(String email) {
        // Regular expression to validate the email according to the specified pattern
        String regex = "^[a-zA-Z0-9._%+-]+@(gmail|yahoo)\\.(com|co\\.in)$";
        
        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create a Matcher object to find matches
        Matcher matcher = pattern.matcher(email);
        
        // Return whether the email matches the regex
        return matcher.matches();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    // Test with some email inputs
        String email1 = "test@gmail.com";
        String email2 = "user@yahoo.co.in";
        String email3 = "invalid-email@domain.com";
        String email4 = "user@xyz.com";

        // Output the results
        System.out.println(email1 + " is valid: " + isValidEmail(email1)); // Expected: true
        System.out.println(email2 + " is valid: " + isValidEmail(email2)); // Expected: true
        System.out.println(email3 + " is valid: " + isValidEmail(email3)); // Expected: false
        System.out.println(email4 + " is valid: " + isValidEmail(email4)); // Expected: false
	}

}
