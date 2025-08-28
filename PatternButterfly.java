import java.util.*;
public class PatternButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();

        //upper half
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=1 ; j<=spaces ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        // takin i=n-1 so that middle row only get once in the upper layer
        for(int i=n-1 ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=1 ; j<=spaces ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
