#include<stdio.h>
#define max 100
int graph[max][max];
int Edges;
void creation(int Edges,int node,int graph_type){
int Tot_nodes=node;
int m,n;
for(int i=0;i<Tot_nodes;i++){
    for(int j=0;j<Tot_nodes;j++){
        graph[i][j]=0;
    }
}
for(int i=0;i<Edges;i++){
        printf("Enter from node : ");
        scanf("%d",&m);
        printf("Enter to node : ");
        scanf("%d",&n);
        graph[m][n]=1;
        if(graph_type==1){
            graph[n][m]=1;
        
    }
}
}
void display(int arr[max][max],int n){
        for(int i=0;i<n;i++){
            printf("[ ");
            for(int j=0;j<n;j++){
                printf("%d ",arr[i][j]);
            }
            printf(" ]");
            printf("\n");
        }
}

int main(){
int choice,n;
while(choice !=3){
    printf("1.Graph Creation");
    printf("\n");
    printf("2.Display ");
    printf("\n");
    printf("3.End .. .. ");
    printf("\n");
    printf("Enter your choice ");
    scanf("%d",&choice);
    switch (choice)
    {
    case 1:
        printf("Select graph Type \n 1.Undirected \n 2.Directed");
        printf("\n");
        int type;
        scanf("%d",&type);
        printf("Enter no of Edges ");
        scanf("%d",&Edges);
        printf("Enter no of nodes ");
        scanf("%d",&n);
        creation(Edges,n,type);
        break;
    case 2:
        printf("Graph ----------------------------");
        printf("\n");
        display(graph,n);
        break;
    case 3:
        printf("Closing the programs... ... ... ");
        break;
    default:
        printf("Invalid input re-enter the input ");
        break;
    }
}

}