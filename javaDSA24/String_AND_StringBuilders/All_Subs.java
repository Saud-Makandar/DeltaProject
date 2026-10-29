package String_AND_StringBuilders;
import java.util.Scanner;
public class All_Subs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str= sc.nextLine();
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
