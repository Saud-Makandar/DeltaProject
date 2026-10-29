package TwoD_Arrays;
import java.util.Scanner;
public class Printing_Patterrns {
    public static void main(String[] args) {
        int[][] arr={{1,2,},{3,4,},{5,6}};
        //column wise printing
        int[][] transpose= new int[2][3];
        for(int j=0;j<2/*no of col*/;j++)
        {
            for(int i=0;i<3/*no of row*/;i++)
            {
               transpose[j][i]=arr[i][j];
            }
        }
        for(int[] ele:transpose)
        {
            for(int x: ele)
            {
                System.out.print(x+" ");
            }
        }
    }
}
