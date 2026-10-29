package Binary_Search;
import java.util.Scanner;
public class Kth_missing
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh value of k : ");
        int k = sc .nextInt();
        int[] arr={2,3,4,7,11};
        int lo=0,hi=arr.length-1;
        int missed=0;
        while(lo<=hi)
        {
            int mid= lo+(hi-lo)/2;
           missed=arr[mid]-(mid+1);
            if(missed<k)lo=mid+1;
            else hi=mid-1;
        }
        int extra = k-(arr[hi]-(hi+1));
        System.out.println("The kth missing no is "+(arr[hi]+extra));

    }
}
