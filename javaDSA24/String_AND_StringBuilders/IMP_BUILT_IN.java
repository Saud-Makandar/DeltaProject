package String_AND_StringBuilders;
import java.util.Scanner;
public class IMP_BUILT_IN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        String str1= "Daud";
        String str2="Sanad";
        System.out.println("Print the string at index [3]");
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('S'));
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str2));
        System.out.println(str2.compareTo(str1));
    }
}
