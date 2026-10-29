package TwoD_Arrays;

public class Set_Zeros_OPT
{
    public static void main(String[] args)
    {
        int[][] arr={{1,2,2,11,21},{33,0,24,21,9},{6,10,7,0,8},{8,4,19,3,99}};
        int m= arr.length;
        int n=arr[0].length;
        boolean row=false;
        boolean col=false;
        for(int r=0;r<m;r++)
        {
            if(arr[r][0]==0)row=true;
        }
        for(int c=0;c<n;c++)
        {
            if(arr[0][c]==0)col=true;
        }
        for(int a=0;a<m;a++)
        {
            for(int b=0;b<n;b++)
            {

               if(arr[a][b]==0)
                {
                    arr[0][b]=0;//Zeroth row ke us column ko zero karo
                    arr[a][0]=0;//Zeroth column ke us row ko zero karo
                }
            }
        }
        for(int i=0;i<m;i++)
        {

            if(arr[i][0]==0)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            if(arr[0][j]==0)
            {
                for(int i=0;i<m;i++)
                {
                    arr[i][j]=0;
                }
            }
        }
        if (row) {
            for (int i = 0; i < m; i++) arr[i][0] = 0;
        }
        if (col) {
            for (int j = 0; j < n; j++) arr[0][j] = 0;
        }
    }
}
