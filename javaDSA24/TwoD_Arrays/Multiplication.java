package TwoD_Arrays;
import java.util.Scanner;
public class Multiplication {
    static void input(int[][] arr, int m, int n, Scanner sc)
    {
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter "+(i+1)+" element at "+(i)+" :");

            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void output(int[][] arr,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            System.out.print("[ ");
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the row of Matrix 1 :");
        int m1=sc.nextInt();
        System.out.println("Enter the no of column for Matrix 1 :");
        int  n1 = sc.nextInt();
        System.out.println("Fill element in matrix 1");
        int[][] arr=new int[m1][n1];
        input(arr,m1,n1,sc);
        System.out.println("Enter the row of Matrix 2 :");
        int m2=sc.nextInt();
        System.out.println("Enter the no of column for Matrix 2 :");
        int  n2 = sc.nextInt();
        System.out.println("Fill element in matrix 2");
        int[][] brr=new int[m2][n2];
        input(brr,m2,n2,sc);
        int[][] ans= new int[m1][n2];
        if(n1==m2)
        {
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    for(int k=0;k<n1;k++)
                    {
                        ans[i][j]+=arr[i][k]*brr[k][j];
                    }
                }
            }
        }
        output(ans,m1,n2);
    }
}
