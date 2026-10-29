#include<stdio.h>
#define size 10
void bfs(int matrix[size][size],int start,int n){
    int Q[n],front=0,rear=0,varr[n];
    for(int i=0;i<n;i++) varr[i]=0;
    Q[rear++]=start;
    varr[start]=1;
    printf("BFS Traversal \n");
    while(front<rear){
        int node=Q[front++];
        printf("%d",node);
        for(int j=0;j<n;j++){
            if(matrix[node][j]==1&&varr[j]==0){
                Q[rear++]=j;
                varr[j]=1;
            }
        }
    }
    printf("\n");
}
void dfs(int matrix[size][size],int start,int n){
    int stack[n],top=-1,varr[n];
    for(int i=0;i<n;i++) varr[i]=0;
    stack[++top]=start;
    printf("DFS Traversal: ");
    while(top!=-1){
        int node=stack[top--];
        if(varr[node]==0){
            printf("%d ", node);
            varr[node] = 1;
            for(int i=0;i<n;i++){
                 if(matrix[node][i] == 1 && varr[i] == 0) {
                    stack[++top] = i;
                } 
            }

        }
    }
    printf("\n");
}
void display(int matrix[size][size],int n){
    
        for(int i=0;i<n;i++){
            printf("[ ");
            for(int j=0;j<n;j++){
                printf(" %d",matrix[i][j]);
            }
            printf(" ]");
            printf("\n");
        }
        
}
int main(){
    int matrix[size][size]={0},node,type,edges;
   /*for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            matrix[i][j]=-1;
        }
    }*/ 
    printf("Enter the no fo nodes present in the Graph : ");
    scanf("%d",&node);
    printf("Enter the type of the graph :\n1. Directed \n2.Undirected\n->");
    scanf("%d",&type);
    printf("Enter number of edges: ");
    scanf("%d", &edges);
    printf("Enter each edge as a pair (from to):\n");
    for (int i = 0; i < edges; i++) {
        int from, to;
        printf("Edge %d: ", i + 1);
        scanf("%d %d", &from, &to);

        matrix[from][to] = 1;
        if (type == 2) {
            matrix[to][from] = 1; // Mirror for undirected
        }
    }

    printf("\nGraph Operation menu...............................................................\n");
    int choice=0;
    int start;
    while(choice!=4){
        printf("1.BFS Traversal\n");
        printf("2.DFS Traversal\n");
        printf("3.Display\n");
        printf("4.Exit");
        printf("Enter ur Choice : ");
        scanf("%d",&choice);
        switch (choice)
        {
            case 1 :
                printf("Enter the starting node for traversal (0 to %d): ", node - 1);
                scanf("%d", &start); 
                bfs(matrix,start,node);    
                break;
            case 2 : 
                printf("Enter the starting node for traversal (0 to %d): ", node - 1);
                scanf("%d", &start);
                dfs(matrix,start,node);
                break;
            case 3 : display(matrix,node);
                 break;
            case 4 : 
                printf("Exiting .. .. .. .. .. .. .. .. ");
                break;
            default:printf("Invalid input Please Try again");
                break;
        }
    }
 return 0;
}