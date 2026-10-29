package String_AND_StringBuilders;
import java.util.Scanner;
public class Most_Occured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Aloo khachalu";
        int num2 = 1;
        char a = ' ';
        for (int i = 0; i < str.length(); i++) {
            int num1 = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == (str.charAt(j))) {
                    num1++;
                }
            }
            if(num2<num1)
            {
                num2=num1;
                a=str.charAt(i);
            }
        }
        System.out.println(a);
    }
}