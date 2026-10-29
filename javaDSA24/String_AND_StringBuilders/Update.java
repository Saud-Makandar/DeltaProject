package String_AND_StringBuilders;
import java.util.Scanner;
public class Update
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a text :");
        String str = sc.nextLine();
        for(int i=1;i<str.length();i++)
        {
            if(i%2==0)
            {
                str=str.substring(i-1)+'a';
            }
        }
        System.out.println("The updated string is :"+str);
    }
}
