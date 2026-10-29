package Sorting;
import java.util.Scanner;
public class Replicate
{
    static void input(int[] arr, int n, Scanner sc)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" element at "+(i)+" :");
                arr[i]=sc.nextInt();
        }
    }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int[] arr = new int [n];
            input(arr,n,sc);
            int[] brr = new int [n];
            for(int i=0;i<n;i++)
            {    int small=Integer.MAX_VALUE;
                int idx=i;//jaise jaise array aage badtee jaiga hum sorted ko chodte jaienge
                for(int j=0;j<n;j++) {
                    if (small > arr[j]&&arr[j]>0) {
                        small = arr[j];
                        idx = j;
                    }

                }
                arr[idx]=-1;//smallest no ko hatakiya
                brr[idx]=i;
            }

            for(int ele:brr)
            {
                System.out.print(ele+" ");
            }
        }
}


