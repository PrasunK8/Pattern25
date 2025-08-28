import java.util.*;
public class PatternHollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows (columns=row+1) : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n+1 ; j++){
                if(i==1 || j==1 || i==n || j==n+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
