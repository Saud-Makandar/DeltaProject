package Methods;
import java.util.Scanner;
public class PascallTriangle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vaule of n ->");
        int n = sc.nextInt();
       for(int i=0;i<=n;i++)
       {
           for(int h=1;h<=n-i;h++)
           {
               System.out.print(" "+" ");
           }
           for(int j=0;j<=i;j++)
         {

           int icj = (fact(i)) / (fact(j) * fact(i - j));
           System.out.print(icj + " "+" "+" ");
             if(j%2==0) System.out.print(" ");
         }
           System.out.println();
       }
    }
    public static int fact(int x)
    {
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
