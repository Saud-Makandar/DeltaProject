package Recursion;
import java.util.Scanner;
public class Array_traversing {
    static void recurr_call(int[] arr,int n)
    {   if(n<0) return ;
        recurr_call(arr,n-1);
        System.out.println(" "+arr[n]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        recurr_call(arr,arr.length-1);
    }
}
