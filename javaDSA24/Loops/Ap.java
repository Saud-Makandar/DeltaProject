package Loops;
import java.util.Scanner;
public class Ap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element of the progression:");
        int a=sc.nextInt();
        System.out.println("Enter the common difference of the progressioin");
        int d=sc.nextInt();
        System.out.println("Enter the number of terms need to be printed");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(" "+a);
           a= a+d;
        }

    }
}
