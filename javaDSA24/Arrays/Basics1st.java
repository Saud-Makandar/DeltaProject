package Arrays;
import java.util.Scanner;
public class Basics1st {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an arrray -> ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" Element of array -> ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The "+(i+1)+" element of array is -> "+arr[i]);
        }
    }
}
