package Pattern;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int nst =1;
        for(int i=1;i<=n;i++)
        { if(i<(n/2+1)){
            for(int h=1;h<=nsp;h++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*"+" ");
            }
            nst+=2;
            nsp--;
            System.out.println();
           }
           else{for(int h=1;h<=nsp;h++)
        {
            System.out.print(" "+" ");
        }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*"+" ");
            }
            nst-=2;
            nsp++;
            System.out.println();
        }

        }
        }

    }

