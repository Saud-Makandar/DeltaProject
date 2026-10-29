package Loops;
import java.util.Scanner;
public class HighestFactor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which need to be factorised:");
        int n=sc.nextInt();
        System.out.println("The Highest factor of the entered number is : ");
        for(int i=n-1;i>1;i--) {
            if (n % i == 0) {
                System.out.print(" " + i);
                break;//Break isiliye kyuki jaise hi iska moulo 0 aaya toh humein apna desired number miljayega therefore we have broken the loop
            }
        }
    }
}
