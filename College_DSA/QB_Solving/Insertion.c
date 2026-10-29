#include<stdio.h>
int main(){
    int arr[]={8,7,6,5,4,3,2,1};
    int n=8;
    for(int i=0;i<n;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0&&arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
   for(int i=0;i<n;i++){
         printf("%d ",arr[i]);
    }
}