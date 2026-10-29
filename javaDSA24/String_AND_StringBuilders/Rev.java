package String_AND_StringBuilders;
import java.util.Scanner;
public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0, j = sb.length() - 1;
        while (i < j) {
            char c = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, c);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}