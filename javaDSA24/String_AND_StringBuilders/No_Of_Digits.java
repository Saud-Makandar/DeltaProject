package String_AND_StringBuilders;
import java.util.Scanner;
public class No_Of_Digits
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        System.out.println("The number of digits of the entered integer are "+str.length());
    }
}
