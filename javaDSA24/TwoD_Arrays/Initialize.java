package TwoD_Arrays;
import java.util.Scanner;
public class Initialize
{
    static void input(int[][] arr,int m,int n,Scanner sc)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter "+(i)+","+(j)+" element of array");
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
            System.out.print(" ]");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m :");
        int m=sc.nextInt();
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int[][] arr=new int[3][3];
       input(arr,m,n,sc);
        output(arr,m,n);

    }
}
