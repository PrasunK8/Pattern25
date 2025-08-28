import java.util.*;
public class PatternHollowRhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars and spaces
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
