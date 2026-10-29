package Pattern;
import java.util.Scanner;
public class DhakkaOP {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+ " ");
            } for(int h=1;h<=i;h++)
            {
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}
