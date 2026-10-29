package Recursion;
import java.util.Scanner;
public class Rsum
{
    static int sum(int n){
        if(n<=0){
            return 0;
        }
       // int sum=0; yeh karne se sum hamesha zero horaha h
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.println(sum(n));

    }
}
