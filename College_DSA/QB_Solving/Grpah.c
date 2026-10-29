#include<stdio.h>
#define size 10
void display(int matrix[size][size],int node){
    for(int i=0;i<node;i++){
        printf("[ ");
        for(int j=0;j<node;j++){
            printf(" %d",matrix[i][j]);
        }
        printf(" ]\n");
    }
}
void bfs (int matrix[size][size],int start,int node){
    int Q[node],varr[node],front=0,rear=0;
    for(int i=0;i<node;i++) varr[i]=0;
    Q[rear++]=start;
    varr[start]=1;
    printf("BFS ... ... ...\n");
    while(front<rear){
        int n=Q[front++];
        printf("%d ",n);
        for(int i=0;i<node;i++){
            if(matrix[n][i]==1&&varr[i]==0){
                Q[rear++]=i;
                varr[i]=1;
            }
        }
    }
    printf("\n");
}
void dfs(int matrix[size][size],int start,int node){
    int stack[node],varr[node],top=-1;
    for(int i=0;i<node;i++) varr[i]=0;
    stack[++top]=start;
    printf("Dfs traversal");
    while(top!=-1){
        int n=stack[top--];
        if(varr[n]==0){
            printf("%d",n);
            varr[n]=1;
            for(int i = node - 1; i >= 0; i--){
                 if(matrix[n][i]==1&&varr[i]==0){
                    stack[++top]=i;
                }
            }
        }
    }
    printf("\n");
}
int main(){
    int matrix[size][size]={0},type,node,edges;
    printf("Enter the number of nodes in the graph : ");
    scanf("%d",&node);
    printf("Enter the type of the graph : ");
    scanf("%d",&type);
    printf("Enter the number of edges : ");
    scanf("%d",&edges);
    for(int i=0;i<edges;i++){
            int from,to;
            printf("Enter edge (from to): ");
            scanf("%d %d", &from, &to);
            matrix[from][to]=1;
            if(type==2){// yeh batayega ki graph is undirected
                matrix[to][from]=1;
        }
    }
    display(matrix,node);
    bfs(matrix,0,node);
    dfs(matrix,0,node);
}