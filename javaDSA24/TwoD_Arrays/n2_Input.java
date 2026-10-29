package TwoD_Arrays;
import java.util.Scanner;
public class n2_Input {
    static void output(int[][] arr,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            System.out.print("[ ");
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the value of r:");
            int r=sc.nextInt();
            int[][] arr = new int[r][r];
            int min_r = 0;
            int max_r = r-1;
            int min_c = 0;
            int max_c = r-1;
           /* while (max_r >= min_r && max_c >= min_c)
            {
                for(int j=min_c;j<=max_c;j++)
                {
                        arr[min_r][j]=sc.nextInt();
                }
                min_r++;
                for(int i=min_r;i<=max_r;i++)
                {
                    arr[i][max_c]=sc.nextInt();;
                }
                max_c--;
                for(int n=max_c;n>=min_c;n--)
                {
                    arr[max_r][n]=sc.nextInt();;
                }
                max_r--;
                for(int m=max_r;m>=min_r;m--)
                {
                    arr[m][min_c]=sc.nextInt();;
                }
                min_c++;
            }*/
            int val=1;
            while (max_r >= min_r && max_c >= min_c)
            {
                for(int j=min_c;j<=max_c;j++)
                {
                    arr[min_r][j]=val++;
                }
                System.out.println();
                min_r++;
                for(int i=min_r;i<=max_r;i++)
                {
                    arr[i][max_c]=val++;
                }
                System.out.println();
                max_c--;
                for(int n=max_c;n>=min_c;n--)
                {
                    arr[max_r][n]=val++;
                }
                System.out.println();
                max_r--;
                for(int m=max_r;m>=min_r;m--)
                {
                    arr[m][min_c]=val++;
                }
                System.out.println();
                min_c++;
            }
            output(arr,r,r);
        }
    }


