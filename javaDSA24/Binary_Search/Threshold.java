package Binary_Search;
import java.util.Scanner;
public class Threshold
{
    static int thresh_Sum(int div,int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%div==0)
            {
                sum+=arr[i]/div;
            }
            else {
                sum+=arr[i]/div+1;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int[] arr={5,1,9,2};
        System.out.println("Enter the value of threshold");
        int threshold = sc.nextInt();
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        int lo=1,hi=max;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            int sum=thresh_Sum(mid,arr);
            if(sum<=threshold) hi=mid-1;//peeche check karo
            else lo=mid+1;
            }
        System.out.println("Minimum divisor: " +(lo));
        }

}

