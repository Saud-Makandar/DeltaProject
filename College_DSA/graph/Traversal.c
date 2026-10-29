#include <stdio.h>
#define MAX 100

int visited[MAX]; // To keep track of visited nodes

// Function for Breadth-First Search (BFS)
void bfs(int matrix[MAX][MAX], int start, int n) {
    int queue[MAX], front = 0, rear = 0;

    // Mark all nodes as unvisited
    for(int i = 0; i < n; i++)
        visited[i] = 0;

    // Start BFS with the starting node
    queue[rear++] = start;
    visited[start] = 1;

    printf("BFS Traversal: ");

    while(front < rear) {
        int node = queue[front++];
        printf("%d ", node);

        // Add all unvisited neighbors to the queue
        for(int i = 0; i < n; i++) {
            if(matrix[node][i] == 1 && visited[i] == 0) {
                queue[rear++] = i;
                visited[i] = 1;
            }
        }
    }
    printf("\n");
}

// Function for Depth-First Search (DFS)
void dfs(int matrix[MAX][MAX], int start, int n) {
    int stack[MAX], top = -1;

    // Mark all nodes as unvisited
    for(int i = 0; i < n; i++)
        visited[i] = 0;

    // Start DFS from the starting node
    stack[++top] = start;

    printf("DFS Traversal: ");

    while(top != -1) {
        int node = stack[top--];

        if(visited[node] == 0) {
            printf("%d ", node);
            visited[node] = 1;

            // Push unvisited neighbors onto the stack
            for(int i = n - 1; i >= 0; i--) {
                if(matrix[node][i] == 1 && visited[i] == 0) {
                    stack[++top] = i;
                }
            }
        }
    }
    printf("\n");
}

int main() {
    int n;
    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    int matrix[MAX][MAX];

    printf("Enter the adjacency matrix (%d x %d):\n", n, n);
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    int start;
    printf("Enter the starting node for traversal (0 to %d): ", n - 1);
    scanf("%d", &start);

    // Run BFS and DFS traversals
    bfs(matrix, start, n);
    dfs(matrix, start, n);

    return 0;
}
