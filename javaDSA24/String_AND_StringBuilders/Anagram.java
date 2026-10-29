package String_AND_StringBuilders;
import java.util.Scanner;
public class Anagram
{
    static int check(StringBuilder sb)
    {
        int sum = 0;
        for(int i=0;i<sb.length();i++)
        {
            char check = sb.charAt(i);
            int a = (int)check;
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        StringBuilder str1 = new StringBuilder("anagram");
        StringBuilder str2 =new StringBuilder("nagaram") ;
        int sum = check(str1);
        int ans = check( str2);
        if(str1.compareTo(str2)==0) System.out.println(" these are the same string ");
        else if(sum==ans) System.out.println("The strings are anagram");
        else System.out.println("The string are not anagrams");
    }
}
