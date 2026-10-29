package Arrays;
import java.util.Scanner;
public class Slarge {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array->");
        int n=sc.nextInt();
        System.out.println("Enter the elment of array->");
        int[] arr=new int[n];
        for(int in=0;in<n;in++)
        {
            arr[in]=sc.nextInt();
        }
        int fmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
         if(fmax<arr[i])
         {
             fmax=arr[i];
         }
        }
     int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(smax<arr[i]&&arr[i]!=fmax)
            {
                smax=arr[i];
            }
        }
        System.out.println("The second largest elemnt of the array is -> "+smax);
    }
}
