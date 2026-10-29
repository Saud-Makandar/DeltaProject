#include<stdio.h>
#define max 100
int graph[max][max];
int varr[max];
void bfs(int graph[max][max],int start,int n){
    int queue[max],front=0,rear=0;
    for(int i=0;i<n;i++){
        varr[i]=0;
    }
    queue[rear++]=start;
    varr[start]=1;
    printf("BFS Traversal ................");
    printf("\n");
    while(front<rear){
        int node = queue[front++];
        printf("%d",node);
        for(int i=0;i<n;i++){
            if(graph[node][i]==1&&varr[i]==0){
                queue[rear++]=i;
                varr[i]=1;
            }
        }
        printf("\n");
    }
}
void dfs(int graph[max][max],int start,int n){
    int stack[max],top=-1;
    for(int i=0;i<n;i++){
        varr[i]=0;
    }
    stack[++top]=start;
    printf("DFS ");
    printf("\n");
    while(top>=0){
        int node = stack[top--];
        if(varr[node]==0){
            printf("%d",node);
            varr[node]=1;
        }
        for(int i=0;i<n;i++){
            if(graph[node][i]==1&&varr[i]==0){
                stack[++top]=i;
        }
    }
 printf("\n");   
}
}
int main(){
    int graph[max][max]={{0,0,1},{0,0,1},{1,1,0}};
    bfs(graph,0,3);
    dfs(graph,0,3);
}