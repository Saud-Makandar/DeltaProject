package TwoD_Arrays;
import java.util.Scanner;
public class Sum_OF_Rect_1 {
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
    }
    static int sum(int[][] arr,int l1,int r1,int l2,int r2)
    {

        int sum = 0;
        for(int m=l1;m<=l2;m++)
        {
           if(r1>=1) sum+=arr[m][r2]-arr[m][r1-1];//yeh direct sum calculate karke degi
            else   sum+=arr[m][r2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
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
        System.out.println("The sum of the given matrix is "+sum(arr,l1,r1,l2,r2));

    }
}
