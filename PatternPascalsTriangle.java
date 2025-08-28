import java.util.*;
public class PatternPascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int iCj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(iCj + " ");
                int iCjplus1 = iCj * (i - j) / (j + 1);
                iCj = iCjplus1;
            }
            System.out.println();
        }
    }
}
