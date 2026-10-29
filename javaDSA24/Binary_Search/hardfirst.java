package Binary_Search;
import java.util.Scanner;
import java.util.Arrays;
public class hardfirst {
    public static void main(String[] args) {
        int[] arr={1,2,1,4,5,6,18,7,9,13};
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Kth smallest no u want ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        int lo=0,hi=arr[arr.length-1];
        int ans=0;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(mid<=k)
            {
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
    }
}
