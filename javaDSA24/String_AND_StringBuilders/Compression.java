package String_AND_StringBuilders;
import java.util.Scanner;
public class Compression
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     String str1="aaaabbcdddd";
     int i=0,j=0;
     char[] check=str1.toCharArray();
     String ans="";
     while(j<str1.length())
     {
        if(check[i]==str1.charAt(j))
        {
            j++;
        }
        else{
            ans+=str1.charAt(i);
            if(j-i>1) {
                ans += (j - i);
            }
                i = j;
        }

     }
        ans+=str1.charAt(i);
        if(j-i>1) {
            ans += (j - i);
        }
        System.out.print(ans);
    }
}
