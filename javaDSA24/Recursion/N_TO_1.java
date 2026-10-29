package Recursion;
import java.util.Scanner;
public class N_TO_1 {
    static void  print(int val)
    {
        if(val==0) return ;
        else System.out.println(val);
        print(val-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max value u need to print till");
        int n = sc.nextInt();
        print(n);

    }
}
