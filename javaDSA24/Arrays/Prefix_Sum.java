package Arrays;
import java.util.Scanner;
public class Prefix_Sum
{
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i+1==arr.length) break;
            arr[i+1]=arr[i]+ arr[i+1];
        }
        print(arr);
    }
}
