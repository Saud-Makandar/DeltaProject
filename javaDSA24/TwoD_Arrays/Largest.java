package TwoD_Arrays;
import java.util.Scanner;
public class Largest {
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
        input(arr,m,n,sc);
        int greatest=arr[0][0];
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(greatest<arr[i][j])
                {
                    greatest=arr[i][j];
                }
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of all elements of array is "+sum);
        System.out.println("The greatest element in the current 2-D matrix is "+greatest);
    }
}
