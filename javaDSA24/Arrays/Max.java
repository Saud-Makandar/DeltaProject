package Arrays;
import java.util.Scanner;
public class Max {
    static void print(int[] arr)
    {
        System.out.println("The elements of array are->");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array -> ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array -> ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=arr[0];
        for(int j=0;j<n;j++)
        {   if(x<arr[j])
         {
             x=arr[j];
         }
        }
        System.out.println("The max element is -> "+x);
        }
}
