#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node * front=NULL,*rear=NULL,*ptr;
void enQ(int d){
    struct Node *temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=d;
    temp->next=NULL;
    if(front==NULL&&rear==NULL){
        front=temp;
        rear=temp;
    }
    else{
        rear->next=temp;
        rear=temp;
    }
}
void DQ(){
    if(front==NULL) printf("Q underflow");
    else{
        ptr=front;
        front=front->next;
        free(ptr);
    }

}