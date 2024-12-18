package Assignments;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Input 2D array
        int[][] arr = {{3, 2, 10}, {1, 4, 8}};

        // Step 1: Find the smallest number and its position
        int minVal = Integer.MAX_VALUE;
        int minRow = -1;
        int minCol = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minVal) {
                    minVal = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        // Step 2: Find the maximum number in the column of the smallest number
        int maxInColumn = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][minCol] > maxInColumn) {
                maxInColumn = arr[i][minCol];
            }
        }

        // Output the results
        System.out.println("Smallest number is: " + minVal);
        System.out.println("Column of smallest number: " + minCol);
        System.out.println("Maximum number in the same column: " + maxInColumn);
	}

}
