package Arrays;
import java.util.Scanner;
public class uniqe_elemnt
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of array-> ");
        int n=sc.nextInt();
//        System.out.println("Enter the target-> ");
//        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int h=0;h<n;h++)
        {
            System.out.println("Enter the "+(h+1)+" Element of array -> ");
            arr[h]=sc.nextInt();
        }
        for(int i=0;i<n;i++)//array mein indexing zero say start hoti hai
        { Boolean flag=false;
            for(int j=i+1;j<n;j++)
            {
              if(arr[i]==arr[j])
              {
                  flag=true;
                  break;
              }

            }   if(flag==false) System.out.println("Unique element is "+i);
        }
//        for(int k=0;k<n;k++)
//        {
//            if(a) System.out.println("The unique elemnt is ->"+k);
//            else System.out.println("No unique elemnt exist");
//        }
    }
}

