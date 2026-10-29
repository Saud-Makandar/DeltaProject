package Module8_Basics;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();//yaha par humne input liya
        if (n%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
