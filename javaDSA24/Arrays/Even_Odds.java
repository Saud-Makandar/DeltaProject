package Arrays;
import java.util.Scanner;
public class Even_Odds
{
    static void swap(int[] arr,int i,int j)
    {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
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
        int[] arr=new int[n];
        System.out.println("Enter the elements of arrays : ");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int e=0;
        int o=n-1;
        while(e<=o)
        {
            if(arr[e]%2==0)
            {
                e++;
            }
            else if(arr[e]%2!=0)
            {
                swap(arr,e,o);
                o--;
            }
        }
        print(arr);
    }
}
