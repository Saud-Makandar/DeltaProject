package Module8_Basics;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        int og = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        int n1 = og;
        int a = 0;
        for (int i = 1; i <= count; i++) {
            a += Math.pow(n1% 10,count);
            n1= n1/ 10;
        }
        if (a == og) System.out.println("The entered number is a Armstrong");
        else System.out.println("The entered number is not a Armstrong");
    }
}
