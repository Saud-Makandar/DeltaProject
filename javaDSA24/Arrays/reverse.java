package Arrays;
import java.util.Scanner;
public class reverse
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int[] brr=new int[5];
        int i=4;
        int j=0;
      while(i>=0)
      {
          brr[j]=arr[i];
          i--;
          j++;
      }
        for(int h=0 ; h<5 ;h++)
        {
            System.out.print(brr[h]+" ");
        }
    }
}
