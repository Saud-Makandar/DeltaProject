#include<stdio.h>
void quicksort(int arr[],int beg,int end);
int Partition(int arr[],int beg,int end);
int main(){
    int arr[10]={9,8,7,6,5,4,3,2,1,0};
     int n = 10;
     printf("Array values Before sorting \n");
    for(int i=0;i<n;i++) 
    {
        printf(" arr[%d] : %d\n",(i+1),arr[i]);
    }
    quicksort(arr,0,n-1);
     printf("Array values after sorting \n");
    for(int i=0;i<n;i++) 
    {
        printf(" arr[%d] : %d\n",(i+1),arr[i]);
    }
}
void quicksort(int arr[],int beg,int end){
    int loc;
    if(beg<end){
        loc = Partition( arr,beg, end);
        quicksort(arr,beg,loc-1);
        quicksort(arr,loc+1,end);
    }
}
int Partition(int arr[],int beg,int end){
    int left=beg,right=end,flag=0,temp;
    int loc=left;
    while(flag!=1){
        if(arr[loc]<arr[right]&&loc!=right) right--;
        else if(loc==right) flag=1;
        else{
            temp=arr[right];
            arr[right]=arr[loc];
            arr[loc]=temp;
            loc=right;
        }
        if(flag!=1){
            if(arr[loc]>arr[left]&&loc!=left) left++;
            else if(loc==left) flag=1;
            else{
                temp=arr[left];
                arr[left]=arr[loc];
                arr[loc]=temp;
                loc=left;
            }
        }
    }
    return loc;
}