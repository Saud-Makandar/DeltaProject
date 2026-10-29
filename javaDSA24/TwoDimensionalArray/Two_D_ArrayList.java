package TwoDimensionalArray;
import java.util.ArrayList;
import java.util.Scanner;
public class Two_D_ArrayList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(6);
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        for(int i =0;i<l.size();i++)
        {
            ArrayList<Integer> x = l.get(i);
            for(int j=0;j<x.size();j++)
            {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
}
