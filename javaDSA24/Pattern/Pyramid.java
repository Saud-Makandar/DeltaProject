package Pattern;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vlaue of row:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int h=1;h<=n-i;h++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
