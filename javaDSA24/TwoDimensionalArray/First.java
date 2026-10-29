package TwoDimensionalArray;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows of array");
        int m=sc.nextInt();
        System.out.println("Enter the no of column of array");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter the element of array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int s=0;s<m;s++)
        {
            for(int z=0;z<n;z++)
            {
                System.out.print(arr[s][z]+" ");
            }
        }

    }
}
