#include <stdio.h>
#define MAX 100
int adjacencyMatrix[MAX][MAX];
int totalNodes;
void createGraph(int graphType) {
    int totalEdges;
    int fromNode, toNode;
    printf("\n--- Graph Creation ---\n");
    printf("Enter the total number of nodes: ");
    scanf("%d", &totalNodes);
    // Initialize adjacency matrix
    for (int i = 0; i < totalNodes; i++) {
        for (int j = 0; j < totalNodes; j++) {
            adjacencyMatrix[i][j] = 0;
        }
    }
    printf("Enter the total number of edges: ");
    scanf("%d", &totalEdges);
    printf("\nEnter each edge as two node indices (from to):\n");
    for (int i = 0; i < totalEdges; i++) {
        printf("Edge %d: ", i + 1);
        scanf("%d %d", &fromNode, &toNode);
        adjacencyMatrix[fromNode][toNode] = 1;
        // Add reverse edge for undirected graph
        if (graphType == 1) {
            adjacencyMatrix[toNode][fromNode] = 1;
        }
    }


    printf("\n✅ Graph created successfully.\n");
}


void displayGraph() {
    printf("\n--- Adjacency Matrix ---\n");
    for (int i = 0; i < totalNodes; i++) {
        for (int j = 0; j < totalNodes; j++) {
            printf("%d ", adjacencyMatrix[i][j]);
        }
        printf("\n");
    }
}


int main() {
    int graphType;
    int userChoice;


    printf("=== Graph Program ===\n");
    printf("Select the type of graph:\n");
    printf("1. Undirected Graph\n");
    printf("2. Directed Graph\n");
    printf("Your choice: ");
    scanf("%d", &graphType);


    while (1) {
        printf("\n--- Menu ---\n");
        printf("1. Create Graph\n");
        printf("2. Display Graph\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &userChoice);


        switch (userChoice) {
            case 1:
                createGraph(graphType);
                break;
            case 2:
                displayGraph();
                break;
            case 3:
                printf("\nProgram terminated.\n");
                return 0;
            default:
                printf("\n Invalid choice. Please enter 1, 2, or 3.\n");
        }
    }
}
