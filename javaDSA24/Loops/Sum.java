package Loops;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int d=0,a=0;
        while(n>0)
        {
            a=n%10;
            d+=a;
            n=n/10;
        }
        System.out.println("The sum of thge entered number is ->"+d);
    }
}
