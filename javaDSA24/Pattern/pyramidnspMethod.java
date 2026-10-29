package Pattern;
import java.util.Scanner;
public class pyramidnspMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row");
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            for(int h=1;h<=nsp;h++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*"+" ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
    }
}
