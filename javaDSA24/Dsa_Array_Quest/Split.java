package Dsa_Array_Quest;

public class Split {
    public static void main(String[] args) {
        int[] arr={5,3,2,6,3,1};
        int sum=0;
        for(int i =0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        if(sum%2!=0)
        {
            System.out.println("Spliting not possible");
            return;// yeh bhi toh ek main function h
        }
        int k=1;
        int[]prefix=new int[arr.length];
        prefix[0]=arr[0];
        int ind=0;
        while(k<arr.length)
        {

                prefix[k]=arr[k]+prefix[k-1];
            if (sum/2==prefix[k]) {
                ind=k;
                break;}
                k++;


        }
        if(ind>0)System.out.println("0 -> "+ind+" and "+(ind+1)+" -> "+(arr.length-1));
    }
}
