package Recursion;
import java.util.Scanner;
public class Maze
{
    public static int maze(int m , int n)
    {
        if(m==1||n==1) return 1;
        int right = maze(m,n-1);
        int left = maze(m-1,n);
        return right + left;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column ");
        int col = sc.nextInt();
        int val=  maze(row,col);
        System.out.println(val);
    }
}
