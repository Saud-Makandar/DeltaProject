#include<stdio.h>
#define Max 10
int main(){
    int hash[Max],i,x,hk,key;
    for(x=0;x<Max;x++)hash[x]=-1;
    printf("Enter the number of keys to be entered in the hash table:(less than or equal to 10) \n"); 
    for(x=0;x<Max;x++) 
    {
        printf("Enter Key %d: ",x+1);
        scanf("%d",&key);
        i=0; 
        hk = (key + i)%Max;
        while(hash[hk]!=1){
            i++;
            hk = (key + i) %  Max;
        }
        hash[hk]=key;
    }
    printf("Hash table:\n"); 
    printf("Index : key \n"); 
    for(x=0;x<Max;x++) 
    { 
    printf("%d : %d \n ",x,hash[x]); 
    } 
}
