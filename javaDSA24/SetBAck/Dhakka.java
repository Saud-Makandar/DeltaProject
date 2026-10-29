package SetBAck;
import java.util.Scanner;
public class Dhakka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" "+" ");
            }
            for(int h=1;h<=i;h++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
      sc.close();
    }
}
