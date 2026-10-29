package SetBAck;
import java.util.Scanner;
public class Star_Mummy
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number:-->");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
            }
            for(int h=1;h<=2*i-1;h++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
