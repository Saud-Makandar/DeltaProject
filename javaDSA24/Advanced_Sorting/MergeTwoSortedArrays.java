package Advanced_Sorting;
public class MergeTwoSortedArrays {
    static void merge(int[] arr,int[] brr,int[] result){
        int i=0,j=0,k=0;
        while(i<arr.length&&j<brr.length){
            if(arr[i]<brr[j])
            {
                result[k++]=arr[i++];
            }
            else result[k++]=brr[j++];
        }
        while (j<brr.length) result[k++]=brr[j++];
        while(i<arr.length) result[k++]=arr[i++];
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int[] brr={1,3,5,7,9};
        int[] c = new int[arr.length+brr.length];
        merge(arr,brr,c);
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
