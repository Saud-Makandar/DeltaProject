package Binary_Search;
import java.util.Scanner;
public class First_Last
{
    static void input(int[] arr, int n, Scanner sc)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter " + (i + 1) + " element at " + (i) + " :");
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        input(arr,size,sc);
        System.out.println("Enter the value of x ");
        int x = sc.nextInt();
        int low=0,high=arr.length-1,lb=size,ub=size;
        while(low<=high)
        {
            int mid=(high-low)/2+low;
            if(arr[mid]>=x)//agar >than h toh aage ki values ko ignore karna h
            {
                lb=mid;
                high=mid-1;
            }
            else low=mid+1;
        }

        low=0;
        high=arr.length-1;
        if(lb<size&&arr[lb]==x)
        {

            while(low<=high)
            {
                int mid=(high-low)/2+low;
                if(arr[mid]>x)//agar >than h toh aage ki values ko ignore karna h
                {
                    ub=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }
        }
        System.out.println("The first occuring position of the element is "+lb+" the last occuring position is "+(ub-1));
    }
}
