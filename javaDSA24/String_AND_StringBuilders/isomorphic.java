package String_AND_StringBuilders;
import java.util.Scanner;
public class isomorphic {
    public static void main(String[] args) {
        String str1="egg";
        String str2="add";
        int i=0;
        boolean flag = true;
        int[] ans= new int[123];
        int[] rev=new int[123];
        while(i < str1.length())
        {
            char temp1= str1.charAt(i);
            int idx = (int)temp1;//yeh batayega ki kis index par value daal ni hai
            char temp2 =str2.charAt(i);
            int value =(int)temp2;//yeh batayega ki kya value dalni h
            if(ans[idx]!=0&&ans[idx]!=value)
            {
                flag=false;
                break;
            }
            if (rev[value] != 0 && rev[value] != idx)
            {
                flag=false;
                break;
            }
            else {
                ans[idx]=value;
                rev[value]=idx;
            }
            i++;
        }
        if(flag) System.out.println("Entered string is a isomrphic ");
        else System.out.println("Not a isomorphic ");
    }
}
