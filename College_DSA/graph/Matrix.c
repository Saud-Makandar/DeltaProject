#include<stdio.h>
#define MAX 10
int adjMatrix[MAX][MAX];
int totNodes;
void createGraph(int Type) {
    int totEdges;
    int from , to;
    printf("Graph creation");
    printf("Enter total number of nodes . . .");
    scanf("%d",&totNodes);
    for(int i=0;i<totNodes;i++)
    {
        for(int j=0;j<totNodes;j++)
        {
           adjMatrix[i][j]=0; 
        }
    }
    printf("Enter total number of edges . . .");
    scanf("%d",&totEdges);
    for(int i=0;i<totEdges;i++)
    {
            printf("Enter the from and to nodes");
            printf("from-> ");
            scanf("%d",&from);
            printf("to-> ");
            scanf("%d",&to);
            adjMatrix[from][to]=1;
            if(Type==1)
            {
                 adjMatrix[to][from]=1;
            }
    }
}
void display() {
    printf("\n--- Adjacency Matrix ---\n");
    for (int i = 0; i < totNodes; i++) {
        for (int j = 0; j < totNodes; j++) {
            printf("%d ", adjMatrix[i][j]);
        }
        printf("\n");
    }
}
int main()
{
    int choice,Type;
    while(choice!=4){
        printf("1. undirected Graph");
        printf("\n");
        printf("2. Directed Graph");
         printf("\n");
        printf("3.Display");
         printf("\n");
        printf("4.Exit");
         printf("\n");
        printf("Enter ur choice");
         printf("\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                printf("Creating an undirected graph ........");
                 printf("\n");
                createGraph(1);
                break;
            case 2:
                printf("Creating  directed graph ........");
                 printf("\n");
                createGraph(2);
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Exiting program ... ... ...");
                break;
            default:
                printf("Invalid input");
                break;
        }
    }
    return 0;
}