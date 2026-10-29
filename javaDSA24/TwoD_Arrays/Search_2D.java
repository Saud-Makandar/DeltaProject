package TwoD_Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        int target= 7;
            int m= matrix.length;
            int n = matrix[0].length;
            boolean flag=false;
            int i=0;
            while(i<m)
            { int j=n-1;
                while(j>=0){
                if(matrix[i][j]>=target)
                {
                    if(matrix[i][j]==target)
                    {
                        flag=true;
                        break;
                    }
                    else {// woh value usse badi h
                        j--;
                    }
                    if(flag) break;
                    i++;
                }
            }
            }

            if(flag)
            {
                System.out.println("Target found");
            }
            else {
                System.out.println("Target not found ");
            }
    }
}
