package Sorting;
import java.util.Scanner;
public class Insertion_Sort
{
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
     int[] arr={5,6,8,1,3,7,9};
     int n =arr.length;
     for(int i=1;i<n;i++/* this will run n-1 times*/)
     {
         for(int j=i;j>0;j--)
         {
             if(arr[j]<arr[j-1])
             {
                swap(arr,j,j-1);
             }
             else break;
         }
     }
    }
}
