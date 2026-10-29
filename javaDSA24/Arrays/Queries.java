package Arrays;
import java.util.Scanner;
public class Queries
{
    static void print(int[] arr,int n,int q)
    {   Scanner sc = new Scanner(System.in);
        int querie;
        for(int i=1;i<=q;i++)
        {
            int check=1;
            querie=sc.nextInt();
           for(int j=0;j<n;j++)
           {
             if(arr[j]==querie) {
                 System.out.println("The element " + querie + " is found in the array");
                 check = -1;
                 break;
             }
           }
            if(check==1)
            {
                System.out.println("Element not found");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
       int[] arr= new int[n];
        System.out.println("Enter the elements of an array->");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of queries");
        int Q =sc.nextInt();
        print(arr,n,Q);
    }
}
