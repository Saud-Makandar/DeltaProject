package Binary_Search;
import java.util.Scanner;
public class search_sorted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target u want to hit");
        int target = sc.nextInt();
        int[] arr={3,4,5,6,7,0,1,2,3};
        int lo=0,hi=arr.length-1;
        int pivot=0;
        while(lo<=hi)
        {
            int mid=lo + (hi-lo)/2;
            if(mid>0&&mid<arr.length-1) {
                if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1] )
                {pivot = mid;break;}
                else if (arr[mid] < arr[mid + 1]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        lo=0;
        hi=pivot;
        while(lo<=hi)
        {   int mid=lo + (hi-lo)/2;
            if(arr[mid]==target)
            {
                System.out.println("Target hit at "+mid);
                break;
            }
            else if(arr[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        lo=pivot+1;
        hi=arr.length-1;
        while(lo<=hi)
        {   int mid=lo + (hi-lo)/2;
            if(arr[mid]==target)
            {
                System.out.println("Target hit at "+mid);
                break;
            }
            else if(arr[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
    }
}
