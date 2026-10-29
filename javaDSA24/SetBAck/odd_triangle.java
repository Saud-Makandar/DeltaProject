package SetBAck;

import java.util.Scanner;

public class odd_triangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number -->");
        int n =  sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
           for(int j=1; j<=2*i-1 ; j++)
           {
               System.out.print(2*j-1 + " ");
           }
            System.out.println();
        }
        sc.close();
    }
}


