package String_AND_StringBuilders;
import java.util.Scanner;
public class Max_String_INT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str={"123","321","455","769"};
        String max= str[0];
        for(int i =0 ;i<str.length;i++)
        {
            max=max(max,str[i]);
        }
        System.out.println("The largest string in numeric form is : "+max);
    }
    static String max(String a,String b)
    {
        String s=purify(a);
        String t=purify(b);
        if(s.length()>t.length()) return a;
        else if(s.length()<t.length()) return b;
        else{
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=t.charAt(i))
                {
                    if(s.charAt(i)>t.charAt(i)) return a;
                     else return b;
                }

            }

        }
        return a;
    }
    static String purify(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
