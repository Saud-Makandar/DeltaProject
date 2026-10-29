package Recursion;
import java.util.Scanner;
public class Pow_log
{
    static int pow(int a,int b)
    {
        if (b == 0) return 1;
        int half = pow(a, b / 2);
        if (b % 2 == 0) return half * half;
        else return a * half * half;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value :");
        int value=sc.nextInt();
        System.out.println("enter the power value :");
        int pow = sc.nextInt();
        System.out.println("The value of "+value+" raise to "+pow+" is "+pow(value,pow));
    }
}
