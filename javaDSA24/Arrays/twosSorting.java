package Arrays;
import java.util.Scanner;
public class twosSorting
{
    public static void main(String[] args)
    {    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array->");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        int i=0;

        while(i!=arr.length)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i=1]=temp;
            }
          if(arr[i]>arr[i+2])
            {
                int temp=arr[i+2];
                arr[i+2]=arr[i];
                arr[i+2]=temp;
                i++;
            }
            else{
                i++;
            }
        }
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" ");
        }

    }
}
