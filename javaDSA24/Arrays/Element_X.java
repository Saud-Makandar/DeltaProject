package Arrays;
import java.util.Scanner;
public class Element_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elment x -> ");
        int x = sc.nextInt();
        System.out.println("Enter the size of array -> ");
      int n=sc.nextInt();
        int[] arr = new int[n];
      boolean flag=true;
        System.out.println("Enter the elements of an array->");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]==x)
            {
                System.out.println("Element x found");
              flag=false;
              break;
            }
        }
        if(flag) System.out.println("Element x not found");

    }
}
