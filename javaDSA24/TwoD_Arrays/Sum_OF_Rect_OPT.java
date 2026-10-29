package TwoD_Arrays;

import java.util.Scanner;

public class Sum_OF_Rect_OPT {
    static void input(int[][] arr, int m, int n, Scanner sc)
    {
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter element at "+(i+1)+" th row :");

            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void  Prefix_sum(int[][] brr)
    {
        for(int i=0;i<brr.length;i++)
        {
            for(int j=1;j<brr[0].length;j++)
            {
                brr[i][j]+=brr[i][j-1];//isse hamara prefix sum hojayega
            }
        }
        for(int n=0;n<brr[0].length;n++)
        {
            for(int m=1;m<brr.length;m++)
            {
                brr[m][n]+=brr[m-1][n];
            }
        }
    }
    static int sum(int[][] arr,int l1,int r1,int l2,int r2)
    {

        int sum = 0;
        if(l1!=0&&r1!=0)
        {
            sum+=arr[l2][r2]-arr[0][r2]-arr[l2][0]+arr[0][0];
        }
        else if(l1!=0)  sum+=arr[l2][r2]-arr[0][r2];
        else sum+=arr[l2][r2]-arr[l2][0];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows of the array :");
        int r = sc.nextInt();
        System.out.println("Enter the no of coulmn of the array :");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        input(arr,r,c,sc);
        Prefix_sum(arr);
        System.out.println("Enter the value of l1");
        int l1=sc.nextInt();
        System.out.println("Enter the value of r1");
        int r1=sc.nextInt();
        System.out.println("Enter the value of l2");
        int l2=sc.nextInt();
        System.out.println("Enter the value of r2");
        int r2=sc.nextInt();
    }
}
