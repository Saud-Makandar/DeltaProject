package SetBAck;

import java.util.Scanner;

public class Number_Bridge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number:-->");
        int n = sc.nextInt();

        for(int i=1;i<=2*n-1;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            for(int h=1;h<=2*i-1;h++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print((n+j)+" ");
            }
            System.out.println();
        }

    }
}

