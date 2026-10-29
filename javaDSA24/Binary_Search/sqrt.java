package Binary_Search;
import java.util.Scanner;
public class sqrt
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int lo=0,hi=num;
        int sqrt=0;
        while(lo<=hi)
        {
            int mid=(hi-lo)/2+lo;
            if(mid*mid<num)
            {
                sqrt=mid;
                lo=mid+1;
            }
            else if(mid*mid>num)  hi=mid-1;
            else { sqrt=mid; break;}

        }
        System.out.print(sqrt);
    }
}
