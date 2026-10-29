package Methods;
import java.util.Scanner;

public class Combination {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vaule of n ->");
        int n = sc.nextInt();
        System.out.println("Enter the value of r ->");
        int r = sc.nextInt();
        fact(n);
        fact(r);
        fact(n-r);
        System.out.println("The combination of the entered data is -> "+(fact(n))/(fact(r)*fact(n-r)));
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
