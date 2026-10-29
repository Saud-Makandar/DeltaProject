package Module8_Basics;
import java.util.Scanner;
public class Takinginputs {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your desire character:");
        char ch=sc.next().charAt(0);
        System.out.println("Your desired character is "+ch);
    }
}
