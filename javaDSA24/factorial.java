import java.util.Scanner;
public class factorial
{
    static int factorial(int fact)
    {
        if(fact==0||fact==1) return 1;
        return fact*factorial(fact-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("The factorial of the entered value is "+factorial(n));

    }
}
