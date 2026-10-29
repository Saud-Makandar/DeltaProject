package Recursion;
import java.util.Scanner;
public class BSR {
    static void input(int[] arr, int n, Scanner sc)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" element at ["+(i)+"] :");
                arr[i]=sc.nextInt();
        }
    }
    static int bs(int[]arr,int lb,int ub,int target)
    {
        int mid = (ub-lb)/2+lb;
        if (lb > ub) return -1;
        if(arr[mid]== target) return mid;
        else if(arr[mid]<target) return bs(arr, mid+1, ub, target);
        else return bs(arr, lb, mid-1, target);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the target u r searching for");
        int target = sc.nextInt();
        input(arr,size,sc);
        int ans = bs(arr, 0, arr.length-1,target );
        if(ans!=-1)
        {
            System.out.println("The element found at the index "+ ans);
        }
    }
}
