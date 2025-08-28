import java.util.*;

public class PatternSnakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill left to right
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Fill right to left
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", matrix[i][j]); // spacing
            }
            System.out.println();
        }
        sc.close();
    }
}
