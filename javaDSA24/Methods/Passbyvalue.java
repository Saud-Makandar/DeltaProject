package Methods;
import java.util.Scanner;
public class Passbyvalue {
    public static int swap(int a)
    {
        a=a+10;
        System.out.println("The value of a ->"+a);
        return a;
    }
    public static void main(String[] args)
    {
    int a=10;
    swap(a);
        System.out.println(a);
        System.out.println("The value of swap function is ->"+swap(a));

    }
}
