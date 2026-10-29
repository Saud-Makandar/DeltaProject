package TwoD_Arrays;

public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12,13,14,15}};
        int min_r = 0;
        int max_r = arr.length-1;
        int min_c = 0;
        int max_c = arr[0].length-1;
        while (max_r >= min_r && max_c >= min_c)
        {
            for(int j=min_c;j<=max_c;j++)
            {
                System.out.print(arr[min_r][j]+" ");
            }
            System.out.println();
            min_r++;
          for(int i=min_r;i<=max_r;i++)
          {
              System.out.print(arr[i][max_c]+" ");
          }
            System.out.println();
          max_c--;
            for(int n=max_c;n>=min_c;n--)
            {
                System.out.print(arr[max_r][n]+" ");
            }
            System.out.println();
            max_r--;
            for(int m=max_r;m>=min_r;m--)
            {
                System.out.print(arr[m][min_c]+" ");
            }
            System.out.println();
            min_c++;
        }
    }
}
