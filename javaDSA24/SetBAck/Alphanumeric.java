package SetBAck;
import java.util.Scanner;
public class Alphanumeric {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number -->");
        int n =  sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            if(i%2==0) {
                for (int j = 1; j <= i; j++) {
                    int d = j + 64;
                    char p = (char) d;//typecasted
                    System.out.print(p + " ");
                }
            }
            else{
                for(int j = 1; j<=i ;j++)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
