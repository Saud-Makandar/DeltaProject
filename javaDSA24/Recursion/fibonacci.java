package Recursion;
import java.util.Scanner;
public class fibonacci {
    static int fib(int n)
    {
        int fibo=0;
        if(n<=1) return n;
        fibo =fib(n-1)+fib(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the term upto u want ur fibonacci series :");
        int n=sc.nextInt();
        System.out.println("the fibionaci term of the entered value is"+fib(n));

    }
}
