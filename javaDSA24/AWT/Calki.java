package AWT;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the value of a");
            int a =sc.nextInt();
            System.out.println("Enter the value of a");
            int b = sc.nextInt();
            int result=a/b;
            System.out.println("The result of the the calculation : "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
        catch(InputMismatchException e){
            System.out.println("Data type un,matched");
        }
    }
}
