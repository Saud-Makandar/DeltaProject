package TwoD_Arrays;
import java.util.Scanner;
public class Rotate_90{
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
    static void output(int[][] arr,int m,int n) {
        for (int i = 0; i < m; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    static void swap(int[][] arr,int i,int j)
    {
        int temp=0;
        temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows :");
        int r= sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c = sc.nextInt();
        int[][] arr=new int[r][c];
        input(arr,r,c,sc);
        if(r==c)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    swap(arr,i,j);
                }
            }
        }
        //reverse row wise
        int m=0;
        for( m=0;m<r;m++)
        {
            int low = 0, high = c - 1;
            while(low<high) {
            int temp = 0;
            temp = arr[m][low];
            arr[m][low] = arr[m][high];
            arr[m][high] = temp;
            low++;
            high--;
        }
               // i++;//when ever u r using while loop then try to increment the loop by ur own self
        }
        output(arr,r,c);
    }
}

