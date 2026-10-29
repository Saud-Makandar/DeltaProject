#include<stdio.h>
#define size 10
int Q[size];
int front=-1,rear=-1;
void enqueue(int value){
    if(rear==size-1) printf("Q is Full");
    else if(front==-1){
        front=0;
        Q[++rear]=value;
        printf("%d is Enqueued onto the Q at index %d ",value,(rear+1));
    }
    else{
        Q[++rear]=value;
        printf("%d is Enqueued onto the Q at index %d ",value,(rear+1));
    }
}
void dequeue(){
    if(front==-1||front>rear) printf("Q is empty");
    else{
        printf("%d element is dequeued from the Q from front index %d ",Q[front++],front);
    }
}
void peek(){
     if(front==-1||front>rear) printf("Q is empty");
     else{
         printf("The topmost element present in the Q is %d",Q[front]);
     }
}
void display(){
    if(front==-1||front>rear) printf("Q is empty");
     else{
        for(int i=front;i<=rear;i++){
            printf("[%d] ",Q[i]);
        }
    }
}
int main() {
    int choice, value;

    while (1) {
        printf("\n--- Queue Menu ---\n");
        printf("1. ENQUEUE\n");
        printf("2. DEQUEUE\n");
        printf("3. PEEK\n");
        printf("4. DISPLAY\n");
        printf("5. EXIT\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                enqueue(value);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                return 0;
            default:
                printf("Invalid choice. Try again.\n");
        }
    }

    return 0;
}
