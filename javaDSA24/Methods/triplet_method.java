package Methods;
import java.util.Scanner;
public class triplet_method
{
    public static int input(int[] a,int n,Scanner sc)
    {
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        return 9;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array->");
        int n=sc.nextInt();
        int[] arr=new int[n];
           input(arr,n,sc);
        for(int j=0;j<n;j++)
        {
            System.out.println("The "+(j+1)+" element of array is -> "+arr[j]);
        }
    }
}
