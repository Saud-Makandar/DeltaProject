package Pattern;
import java.util.Scanner;
public class StarBridge {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n -> ");
        int n = sc.nextInt();
        for(int s=1;s<=2*n-1;s++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        for (int i = 1; i <= n-1; i++)
        {
             {
                 for (int j = n - i; j >= 1; j--) {
                     System.out.print("*"+" ");
                 }
                 for (int k = 1; k <= 2*i-1; k++) {
                     System.out.print(" "+" ");
                 }
                 for (int l = n - i; l >= 1; l--) {
                     System.out.print("*"+" ");
                 }
             }

            System.out.println();
        }
    }
}
