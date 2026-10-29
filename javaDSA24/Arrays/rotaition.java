package Arrays;
import java.util.Scanner;
public class rotaition {
        public static void Display(int[] x) {
            for (int s = 0; s < x.length; s++) {
                System.out.print(x[s] + " ");
            }
            System.out.println("");
        }
        public static int[] Reverse(int[] brr,int m, int n)
        {
            while(m<n)
            {  int temp=0;
                temp=brr[n];
                brr[n]=brr[m];
                brr[m]=temp;
                m++;
                n--;
            }
            return brr;
        }
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            int[] arr={1,2,3,4,5,6,7};
            int i=0;int j=arr.length-1;
            Display(arr);
            Reverse(arr,i,j);
            Reverse(arr,i,2);
            Reverse(arr,4,6);
            Display(arr);

        }
    }

