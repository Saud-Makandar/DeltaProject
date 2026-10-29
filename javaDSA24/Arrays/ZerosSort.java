package Arrays;
import java.util.Scanner;
public class ZerosSort
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array->");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int noOfzeros=0;
        int noOfones=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==0) noOfzeros+=1;
            else  noOfones+=1;
        }
        for(int k=0;k<noOfzeros;k++)
        {
            arr[k]=0;
        }
        for(int l=noOfzeros;l<arr.length;l++)
        {
            arr[l]=1;
        }
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" ");
        }
    }
}
