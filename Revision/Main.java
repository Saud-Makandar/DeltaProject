import java.util.*;
class Main{
    public static void main(String args[]){
        int a,b;
        Scanner input = new Scanner(System.in);
       
        try {   System.out.print("Enter The value of a : ");
            a = input.nextInt();
            System.out.print("Enter The value of b : ");
            b = input.nextInt();
            input.close();
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");


        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid Input");
        }
    }
}