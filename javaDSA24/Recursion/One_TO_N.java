package Recursion;
import java.util.Scanner;
public class One_TO_N {
    static void  print(int val)
    {
        if(val==0) return ;
        print(val-1);
        System.out.println(val);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max value u need to print till");
        int n = sc.nextInt();
        print(n);

    }
}
