package Assignments;

public class Assignment7_2 {

	// Method 2: Without Using Loops (Using Recursion)
    public static boolean isPalindromeWithoutLoops(String str) {
        // Convert to lower case for case insensitivity
        str = str.toLowerCase();

        // Base condition: if the string has length 0 or 1, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Not a palindrome
        }

        // Recursively check the substring (excluding the first and last characters)
        return isPalindromeWithoutLoops(str.substring(1, str.length() - 1));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "Madam";
	        
	        // Check palindrome using the recursion method
	        System.out.println("Is palindrome without loops: " + isPalindromeWithoutLoops(str)); // Expected: true
	}

}
