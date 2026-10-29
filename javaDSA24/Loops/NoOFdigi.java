package Loops;
import java.util.Scanner;
public class NoOFdigi {
    public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int count=0;
        while(n!=0)
        {
          if(n%10!=0) count+=1;
          n/=10;
        }
        System.out.println("The number of digits in the entered number is : "+count);
    }
}
