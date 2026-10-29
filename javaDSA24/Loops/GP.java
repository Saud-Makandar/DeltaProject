package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element of the progression:");
        int a=sc.nextInt();
        System.out.println("Enter the common ratio of the progression");
        int r=sc.nextInt();
        System.out.println("Enter the number of terms need to be printed");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
    {
        System.out.print(" "+a);
        a*=r;
    }
    }
}
