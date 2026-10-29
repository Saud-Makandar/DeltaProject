import java.util.Scanner;
class Transpose
{
    static void input(int[][]arr,int m,int n,Scanner sc)
    {
     for(int i=0;i<m;i++)
     {
        System.out.println("Enter element in "+(i+1)+" row :");
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
     }   
    }
     static void trans(int[][]arr,int m,int n)
     {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
     }
    static void output(int[][] arr,int m, int n)
    {
       for(int i=0;i<m;i++)
     {
        
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
     }    
    }
    public static void main(String[] args) 
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the no of rows of an array :");
            int m = sc.nextInt();
            System.out.println("Enter the no of columns :");
            int n = sc.nextInt();
            int [][] arr = new int[m][n];
            input(arr,m,n,sc);
            trans(arr,m,n);
            output(arr,m,n);
        }
    
}