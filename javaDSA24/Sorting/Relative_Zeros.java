package Sorting;
import java.util.Scanner;
public class Relative_Zeros
{
    public static void main(String[] args)
    {
        int[] arr={1,4,20,5,0,8,0,-2,6};
        int NoOfZeros=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) NoOfZeros++;
        }
        for(int x =0;x< NoOfZeros;x++)
        {
            for(int i=0;i<arr.length-1-NoOfZeros;i++)
            {
                if(arr[i]==0)
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int ele:arr)
        {
            System.out.println(ele + " ");
        }
    }
}
