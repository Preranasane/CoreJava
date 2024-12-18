package Assignments;

public class Assignment8 {


    // Method 1: Using Loops (Bubble Sort to sort and loop to print)
    public static void sortArrayWithLoops(int[] arr) {
        // Bubble sort to sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array using a loop
        System.out.print("Sorted array using loops: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {1, 5, 2, 8, 9, 4};
	        
	        // Sort and print array using loops
	        sortArrayWithLoops(arr);
	}

}
