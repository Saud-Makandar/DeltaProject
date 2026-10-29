package Arrays;
import java.util.Scanner;
public class Monotonic
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array-> ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of array -> ");
        for(int h=0;h<n;h++)
        {
            arr[h]=sc.nextInt();
        }
        boolean f1=true;
        for(int i=0;i<n-1;i++) {
            for (int j = i + 1; j <= i + 1; j++) {
                if (arr[i] > arr[j]) {
                 f1=false;
                }
            }
            if (f1==false) break;
        }
      boolean f2=true;
        //Dec
        for(int z=0;z<n-1;z++) {
            for (int s = z + 1; s <= z + 1; z++) {
                if (arr[z] < arr[s]) {
                    f2=false;
                }

            }
            if (f2==false) break;
        }
        if(f1||f2)
        {
            if(f1) System.out.println("Monotonically increasing");
            else  System.out.println("Monotonically decreasing");
        }
        else System.out.println("Neither inc nor decreasing");
    }
}
