package Arrays;
import java.util.Scanner;
public class triplet
    {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array-> ");
        int n=sc.nextInt();
        System.out.println("Enter the target-> ");
        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int h=0;h<n;h++)
        {
            System.out.println("Enter the "+(h+1)+" Element of array -> ");
            arr[h]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)//array mein indexing zero say start hoti hai
        {
            for(int j=i+1;j<n-1;j++)
            {
               for(int k=j+1;k<n;k++)
               {
                   if((arr[i]+arr[j]+arr[k])==x) System.out.println("One of the target pair is->"+arr[i]+","+arr[j]+","+arr[k]);
               }
            }
        }
    }
}


