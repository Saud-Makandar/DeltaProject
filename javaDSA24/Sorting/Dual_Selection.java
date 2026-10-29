package Sorting;
import java.util.Scanner;
public class Dual_Selection
{
    static void input(int[] arr, int n, Scanner sc)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" element at "+(i)+" :");
            arr[i]=sc.nextInt();
        }
    }
    static void output(int[] arr,int n)
    {
        for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        input(arr,size,sc);

        int i=0;
        int k=size-1;
        while(i<k)
        {
            int min = arr[i];
            int max = arr[i];
            int idx1=i;
            int idx2=i;
            for(int j=i;j<=k;j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                    idx1=j;
                }
                if(max<arr[j])
                {
                    max=arr[j];
                    idx2=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[idx1];
            arr[idx1]=temp;

            int temp1=arr[k];
            arr[k]=arr[idx2];
            arr[idx2]=temp1;
            i++;
            k--;
        }
        output(arr,size);
    }
}
