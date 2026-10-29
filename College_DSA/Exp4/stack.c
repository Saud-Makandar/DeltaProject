#include<stdio.h>
#include<stdlib.h>
struct stack{
    int data;
    struct stack*next;
};
struct stack* top=NULL;
void push(int value){
    struct stack* temp=(struct stack*)malloc(sizeof(struct stack));
    temp->data=value;
    temp->next=top;
    top=temp;
    printf("Pushed %d onto the stack\n", value);
}
void pop(){
    struct stack* temp=(struct stack*)malloc(sizeof(struct stack));
    if(top==NULL) printf("Stack underflow");
    else{
        temp=top;
        printf("Popped %d from the stack\n", top->data);
        top=top->next;
        free(temp);
    }
}
