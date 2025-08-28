import java.util.*;
public class PatternNumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows (half diamond height): ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
