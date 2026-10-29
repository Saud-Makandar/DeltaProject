package String_AND_StringBuilders;
import java.util.Scanner;
public class reverse_word
{
    static StringBuilder rev(StringBuilder sb,int i,int j)
    {
        while (i < j) {
            char c = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, c);
            i++;
            j--;
        }
        return sb; 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i=0,j=0;
        while(j<=sb.length())
        {
           if(j==sb.length()||sb.charAt(j)==' ')
           {
               rev(sb,i,j-1);
                i=j+1;

            }
         j++;
        }
        System.out.println("Reversed words: " + sb);
    }
}
