package TwoD_Arrays;
import java.util.Scanner;
public class Roll_no {
    static void input(int[][] arr,int m,int n,Scanner sc)
    {
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter Roll no of Student "+(i+1)+" at "+(i)+" ");

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
        System.out.println("Enter the number of student who's marks are reported:");
        int m = sc.nextInt();
        int n=2;
        int[][] arr=new int[m][n];
        input(arr,m,n,sc);
        output(arr,m,n);
    }
}
