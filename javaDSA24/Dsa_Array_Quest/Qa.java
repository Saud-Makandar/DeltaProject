package Dsa_Array_Quest;
import java.util.Scanner;
public class Qa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array -> ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array -> ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0,right=arr.length-1;
       while(left<right)
        {
            if(arr[left]%2!=0&&arr[right]%2==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]%2==0) left++;
            if(arr[right]%2!=0)right--;
        }
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" ");
        }
    }

}
