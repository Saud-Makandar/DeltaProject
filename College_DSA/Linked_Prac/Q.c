#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node* next;
};
struct Node* front=NULL,*rear=NULL;
void creation(int value){
    struct Node*newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=value;
    newNode->next=NULL;
    if(front==NULL&&rear==NULL)
    {
        front=newNode;
        rear=newNode;
    }
    else{
        rear->next=newNode;
        rear=newNode;
    }
}
void deqeueue(){
    if(front==NULL){
        printf("Queue is empty");
    }
    else{
        struct Node* temp;
        temp=front;
        front=front->next;
        free(temp);
    }
}
void display(){
    if(front==NULL) printf("The Q is empty ... ... ...");
    else{
        struct Node* temp;
        temp=front;
        while(temp!=NULL){
            printf("%d ", temp->data);
            printf("\n");
            temp=temp->next;
        }
    }
}

