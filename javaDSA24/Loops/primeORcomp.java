package Loops;
import java.util.Scanner;
public class primeORcomp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean Flag= true;
        System.out.println("Enter the number u need to check:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                Flag=false;
                break;
            }
        }
        if(Flag){
            System.out.println("The entered number is prime");
        }
            else {
            System.out.println("The entered number is composite");
        }


    }
}
