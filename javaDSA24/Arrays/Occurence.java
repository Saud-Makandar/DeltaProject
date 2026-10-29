package Arrays;
import java.util.Scanner;
public class Occurence
{
    public static void main(String[] args)
    {   int[] arr={1,2,3,4,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number u need too check-> ");
        int n=sc.nextInt();
        int occur=0;
        boolean flag=true;
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                occur+=1;
                flag=false;
            }

        }
        if(flag)
        {
            System.out.println("The element do not exist");
        }
        else {
            System.out.println("The given element " + n + " has occur " + occur + " times ");
        }
    }
}
