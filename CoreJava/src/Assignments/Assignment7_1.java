package Assignments;

public class Assignment7_1 {

	 // Method 1: Using Loops
    public static boolean isPalindromeWithLoops(String str) {
        // Convert the string to lower case to handle case insensitivity
        str = str.toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters from both ends
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It is a palindrome
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str = "Madam";
	        
	        // Check palindrome using the loop method
	        System.out.println("Is palindrome using loops: " + isPalindromeWithLoops(str)); // Expected: true
	        
	}

}
