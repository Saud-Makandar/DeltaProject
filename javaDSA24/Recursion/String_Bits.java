package Recursion;
import java.util.Scanner;
public class String_Bits {
    static void str(String s,int n)
    {//Yaha pe hum String ko zero length se n tak lejayeinge Therefor
        //base case ke liye str.length()==m perfect h
        if(s.length()==n)
        {
            System.out.println(s);
            return;
        }
        // zero wala case toh hamesha hi chalega
        str(s+"0",n);
        if(s.isEmpty() || s.charAt(s.length() - 1) != '1') str(s + "1", n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="";
        System.out.println("Enter the number of data bits u want ");
        int n = sc.nextInt();
        str(s,n);
    }
}
