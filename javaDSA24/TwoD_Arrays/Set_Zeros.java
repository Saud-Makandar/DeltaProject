package TwoD_Arrays;
import java.util.Arrays;
public class Set_Zeros {
    public static void main(String[] args)
    {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
      /*  int[][] helper= new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0 ;j<arr[0].length;j++)
            {
                helper[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(helper[i][j]==0)
                {
                    int m=i;
                    int n=0;
                    while(n<arr[0].length)
                    {
                        arr[m][n++]=0;
                    }
                    int h=0;
                    int k=j;
                    while(h<arr.length)
                    {
                        arr[h++][j]=0;
                    }

                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0 ;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int m = arr.length;
        int n= arr[0].length;
        boolean[] row= new boolean[m];
        boolean[] col= new boolean[n];
        for(int i=0;i<m;i++)
        {//This loop is going to function as a checker for the og one
            for(int j=0 ;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }

        }
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0 ;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
