class Leet_26
{
    static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
        int[] arr={0,0,0,0,1,1,1,1,2,2,2,2};
        int idx=1;
        int value=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            
            if(value!=arr[i])
            {
                value=arr[i];
                swap(arr,idx,i);
                idx++; 
            }   
        }
        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }
    }
}