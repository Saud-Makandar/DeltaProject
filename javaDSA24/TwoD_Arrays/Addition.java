package TwoD_Arrays;
import java.util.Scanner;
public class Addition {
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
        System.out.println("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        int[][] brr=new int[m][n];
        int[][] ans=new int[m][n];
        input(arr,m,n,sc);
        System.out.println("Now Fill out the second matrix :");
        input(brr,m,n,sc);
        if(m==n)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ans[i][j]=arr[i][j]+brr[i][j];
                }
            }
        }
        output(ans,m,n);
    }
}
