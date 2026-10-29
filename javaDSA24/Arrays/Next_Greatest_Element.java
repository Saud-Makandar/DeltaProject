package Arrays;
import java.util.Scanner;
public class Next_Greatest_Element {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 1000, 105, 25, 688, 99, 46, 522, 79, 104};
        int n = arr.length;
        int[] max = new int[n];
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            max[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        print(arr);
        System.out.println();
        max[n-1]=-1;
        print(max);
    }
}