package String_AND_StringBuilders;
import java.util.Scanner;
public class Toggle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String ans="";//isko aisa initialize karna hota ha nhi to
        for(int i=0;i<str.length();i++)
        {
            String s =""+ str.charAt(i);
            int comp = Integer.parseInt(s);
            if(comp>=65 || comp<=90) ans+=comp+32;
            else ans+=comp-32;
        }
    }
}
