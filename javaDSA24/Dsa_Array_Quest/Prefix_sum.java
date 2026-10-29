package Dsa_Array_Quest;
import java.util.Scanner;
public class Prefix_sum
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array -> ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array -> ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int lower=0,uppper=1;
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" ");
        }

    }
}
