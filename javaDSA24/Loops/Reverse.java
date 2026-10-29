package Loops;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int d=0;
        while(n>0)
        {

            d= d*10+n%10;
            n=n/10;
        }
        System.out.println("The sum of the entered number is ->"+d);
    }
}
