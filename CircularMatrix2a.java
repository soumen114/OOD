import java.util.Scanner;

public class CircularMatrix2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the matrix
        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        // Create a matrix of size n x n
        int[][] matrix = new int[n][n];

        // Define boundaries for the circle (left, right, top, bottom)
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;  // Start with 1

        // Loop until all positions are filled
        while (left <= right && top <= bottom) {
            // Fill the top row from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Fill the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Fill the bottom row from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Fill the left column from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Print the matrix with proper formatting
        System.out.println("The filled matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t"); // Added tab for better spacing
            }
            System.out.println();
        }

        scanner.close();
    }
}
