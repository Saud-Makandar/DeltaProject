package SetBAck;
import java.util.Scanner;
public class Star_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (ODD) :-->");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++)
        {
            for(int j = 1 ; j <= n ;j++)
            {
                if( i==n/2+1||j==n/2+1 )
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");//jaise humne star ke baad spacing di wase hi humne space ke baad bhi spcaing di
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
