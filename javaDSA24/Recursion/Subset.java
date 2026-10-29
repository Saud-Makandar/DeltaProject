package Recursion;
import java.util.Scanner;
public class Subset
{
    static void sub(int i ,String ip , String ans)
    {
        if(i==ip.length()){
            System.out.println(" The sub sets are : "+ans);
            return;
        }
       sub(i+1,ip,ans+ip.charAt(i));//pickup
        sub(i+1,ip,ans);//reject
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String ip = sc.nextLine();
        String ans = "";
        sub(0,ip,ans);
    }
}
