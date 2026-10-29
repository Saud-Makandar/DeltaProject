package Sorting;
import java.util.Scanner;
public class Selection_sort
{
    public static void main(String[] args)
    {
        int[] arr={3,5,2,1,4};
        int n=arr.length;

        for(int i=0;i<n;i++)
        {    int small=arr[i];
            int idx=i;//jaise jaise array aage badtee jaiga hum sorted ko chodte jaienge
            for(int j=i;j<n;j++)
            {
                if(small>arr[j])
                {
                    small=arr[j];
                    idx=j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
