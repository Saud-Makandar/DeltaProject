#include<stdio.h>
#define Max 10
void bfs(int martix[Max][Max],int start,int n){
    int Q[Max],front=0,rear=0;
    int varr[n];
    for(int i=0;i<n;i++) varr[i]=0;
    //Enqueue step
    Q[rear++]=start;
    varr[start]=1;
    printf("BFS traversal ...");
    while(front<rear){
        int node=Q[front++];
        printf("%d",node);
        for(int i=0;i<n;i++)
        {
            if(martix[node][i]==1&&varr[i]==0){
                //then enqueue that element;
                Q[rear++]=i;
                varr[i]=1;
            }
        }
       
    }
     printf("\n");
}
