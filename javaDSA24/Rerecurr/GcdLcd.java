package Rerecurr;
import java.util.Scanner;
public class GcdLcd {
    public static int  gcd(int dividend,int divisor){
        if(divisor == 0) return dividend;
      return   gcd(divisor,dividend%divisor);// long division method
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2 : ");
        int num2 = sc.nextInt();
        int gcd = gcd(num1,num2);
        int lcm=((num1*num2)/gcd);
        System.out.println("GCD of the given number is : "+gcd);
        System.out.println("LCM of the given number is : "+lcm);
    }
}
