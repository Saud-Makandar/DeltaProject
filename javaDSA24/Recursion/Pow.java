package Recursion;
import java.util.Scanner;
public class Pow {
    public static int pow(int a,int b) {
        if(b==0)return 1;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter exponent");
        int expo = sc.nextInt();
    int power = pow(base,expo);
        System.out.println("The value of "+base+" raise to "+expo+" is "+power);
    }
}
