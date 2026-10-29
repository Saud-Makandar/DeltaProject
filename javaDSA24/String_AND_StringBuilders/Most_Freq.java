package String_AND_StringBuilders;
import java.util.Scanner;
public class Most_Freq
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int[] freq = new int[123];
        String s = " Saudisthegaot";
        for(int i=0;i<s.length();i++)
        {
            char temp = s.charAt(i);
            int j=(int) temp;
            freq[j]+=1;
        }
        int value = freq[97];
        for(int i=98;i<=122;i++)
        {
         if(freq[97]<freq[i]) value=i;
        }
        char ans =(char) value;
        System.out.println("The most recuring char is "+ans);

    }
}
