import java.util.Scanner;

public class MatrixMultiplication3a {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare two 4x4 matrices A and B, and the result matrix C
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        // Input for matrix A
        System.out.println("Enter elements of matrix A (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Input for matrix B
        System.out.println("Enter elements of matrix B (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices A and B to get matrix C
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = 0;  // Initialize matrix C[i][j] to 0
                for (int k = 0; k < 4; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display the result matrix C
        System.out.println("Product of matrix A and matrix B (Matrix C):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
