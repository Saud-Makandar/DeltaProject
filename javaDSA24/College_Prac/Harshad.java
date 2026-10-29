package College_Prac;
import java.util.Scanner;
public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int copy=n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        if(copy%sum==0){
            System.out.println("Yess");
        }
        else{
            System.out.println("no");
        }
    }
}
