package Arrays;
import java.util.Scanner;
public class fst_Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array-> ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int h = 0; h < n; h++) {
            System.out.println("Enter the " + (h + 1) + " Element of array -> ");
            arr[h] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)//array mein indexing zero say start hoti hai
        {
            int a=1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    a=-1;
                    System.out.println("The answer is "+arr[i]);
                }

            }  if(a==-1) break;


        }
    }
}