package String_AND_StringBuilders;
import java.util.*;
public class First_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String as array
    /*    char[] str1={'H','o','n','g',' ','H','a','e',' ','i','n'};
        for(char c : str1)
        {
            System.out.print(c);
        }*/
        //String direct intialization
       // String str2="Saud is the most intelligent being at present time";
        // System.out.println(str2);
        //Taking user input
        System.out.println("Enter a string input :");
        String str=sc.next();
        sc.nextLine();
        System.out.println("Enter another string input :");
        String strr=sc.nextLine();
        System.out.println(str+" "+strr);
    }
}
