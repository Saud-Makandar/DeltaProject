package SetBAck;
import java.util.Scanner;
public class Binary_Tri
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row number:-->");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {  int m=1;
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(m);
                    m=(m+1)%2;
                }
                else {
                    m=(m+1)%2;
                    System.out.print(m);
                }
            }
            System.out.println();
        }
    }
}
