package Arrays;

import java.util.Scanner;

public class Non_Decreasing_1
{
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] Reverse(int[] brr,int m, int n)
    {
        while(m<n)
        {  int temp=0;
            temp=brr[n];
            brr[n]=brr[m];
            brr[m]=temp;
            m++;
            n--;
        }
        return brr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int k=0;
        int[] ans= new int[n];
        while(i<=j)
        {
            if(Math.abs(arr[i])>Math.abs(arr[j]))
            {
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            else
            {
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        Reverse(ans,0,n-1);
        print(ans);

    }
}
