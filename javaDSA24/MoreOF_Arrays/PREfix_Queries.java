package MoreOF_Arrays;
import java.util.Scanner;
public class PREfix_Queries {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of quereis u want :");
        int Q=sc.nextInt();
        int[] arr={0,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<Q;i++)
        {   int max=0;
            System.out.println("Enter the start Query value 'L' :");
            int Ql=sc.nextInt();
            System.out.println("Enter the end Query value 'R' :");
            int QR= sc.nextInt();
            while(Ql<=QR)
            {
                max+=arr[Ql];
                Ql++;
            }
            System.out.println(max);
        }

    }
}
