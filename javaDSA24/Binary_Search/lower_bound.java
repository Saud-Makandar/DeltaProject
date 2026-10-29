package Binary_Search;
import java.util.Scanner;
public class lower_bound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70};
        System.out.println("Enter the value of x ");
        int x = sc.nextInt();
        int low=0,high=arr.length-1;
        boolean flag =false ;
        int idx=0;
        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]<x)
            {
                low=mid+1;//mid se pehle wala saara array hata do
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
                idx=mid;

            }
            else if(arr[mid]==x)
            {
               int i= mid-1;
               int j= mid ;
               while(i>=0)
               {
                   if(arr[j]==arr[i])
                   {
                       idx=i;
                   }
                   else break;
                   i--;
               }
            }
        }
        System.out.println("Lower Bound is "+idx);
    }
}
