package Binary_Search;

public class Peak_ind
{
    public static void main(String[] args)
    {
     int[] arr = {1, 2, 3, 4, 3};
        int size=arr.length;
        int lb=size;
        int low=0,high=size-1;
        while(low<=high)
        {
            int mid = (high-low)/2 +low;
            if(mid>0&&mid<size-1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    lb = mid;
                    break;
                } else if (arr[mid] > arr[mid - 1]) low = mid+1;
                else high = mid-1;
            }
        }
        System.out.println("The peak index value is"+lb);
    }
}
