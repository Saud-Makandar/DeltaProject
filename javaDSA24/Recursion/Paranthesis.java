package Recursion;
import java.util.Scanner;
public class Paranthesis {
    public static void match(int n,String ans , int l ,int r)
    {
        if(r==n) {
            System.out.println(" "+ans);
            return;
        }
        if(l<n)  match(n,ans+"(",l+1,r);
        if(r<l)  match(n,ans+")",l,r+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n ");
        int n = sc.nextInt();
        String ans = "";
        match(n,ans,0,0);
    }
}
