package String_AND_StringBuilders;
import java.util.StringJoiner;
import java.util.Scanner;
public class Finding_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a text :");
        String str = sc.nextLine();
        int count=0;
        for(int s=0;s<str.length();s++)
        {
            if(str.charAt(s)=='a'||str.charAt(s)=='e'||str.charAt(s)=='i'||str.charAt(s)=='o'||str.charAt(s)=='u') count++;
          else  if(str.charAt(s)=='A'||str.charAt(s)=='E'||str.charAt(s)=='I'||str.charAt(s)=='O'||str.charAt(s)=='U') count++;
        }
        System.out.println(count);
    }
}
