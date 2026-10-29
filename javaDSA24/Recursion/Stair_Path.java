package Recursion;
import java.util.Scanner;
public class Stair_Path
{
    static int stair(int path)
    {
        if(path<=2) return path;
        int ans = stair(path-1)+stair(path-2);
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of stair u want to climb ");
        int stair_no=sc.nextInt();
        System.out.println("The no of paths requires to climb "+stair_no+" is "+stair(stair_no));
    }
}
