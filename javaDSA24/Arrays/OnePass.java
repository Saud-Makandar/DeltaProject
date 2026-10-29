package Arrays;

import java.util.Scanner;

public class OnePass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array->");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j= arr.length-1;
        while(i<j)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }

            else{
                i++;
                j--;
            }
        }
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" ");
        }

    }
}
