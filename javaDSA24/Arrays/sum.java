package Arrays;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an arrray -> ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter marks of student "+(i+1));
                arr[i]=sc.nextInt();
            }
            int sum =0;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }
            System.out.println("The sum of the entered element is -> "+sum);
        }
    }
}
