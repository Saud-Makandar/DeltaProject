package Dsa_Array_Quest;
import java.util.Scanner;
public class Mergesort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,3,5,7,9};
        int[] brr={2,4,6,8,10};
        int[] mrr= new int[10];
        int j=0,h=0;
        for(int i=0;i<10;i++)
        {
            for(;j<arr.length;j++)
            {
                for(;h<brr.length;h++)
                {
                    if(arr[j]<brr[h])
                    {
                        mrr[i]=arr[j];
                        j++;
                        break;
                    }
                    else if(arr[j]>brr[h])
                    {
                        mrr[i]=brr[h];
                        h++;
                        break;
                    }
                    else
                    {

                        mrr[i]=arr[j];
                        j++;
                        break;
                    }

                }
            }
        }
        for(int m=0;m<10;m++)
        {
            System.out.print(mrr[m]+" ");
        }
    }
}
