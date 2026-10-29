package Binary_Search;
import java.util.Scanner;
public class Binary_Search
{
    static void input(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element at " + (i) + " :");
            arr[i] = sc.nextInt();
        }
    }

    /*static void output(int[] arr,int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }


    }*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int size=arr.length;
        int lb=size;
        System.out.println("Enter the Target :");
        int target = sc.nextInt();
        int low=0,high=size-1;
        while(low<=high)
        {
            int mid = (high-low)/2 +low;
            if(arr[mid]>=target)
            {
                high=mid-1;
                lb=mid;
            }
            else  low=mid+1;//mid se pehle wala saara array hata do
        }
        if(lb!=arr.length) System.out.println("Lower bound index for target " + target + " is: " + lb);
        else System.out.println("No target found");
    }
}
