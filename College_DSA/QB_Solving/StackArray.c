#include<stdio.h>
#define size 10
int top=-1;
int stack[size];
void push(int value){
    if(top==size-1) {printf("Stack OverFlow");
    printf("\n");
}    
    else{
    stack[++top]=value;
    printf("The value : %d is been pushed onto the stack at position %d",value,top);
    printf("\n");
    }
}
void pop(){
    if(top==-1) {
        printf("Stack UnderFlow");
        printf("\n");
    }
    else{
    printf("The value poped from the stack is %d from %d",stack[top--],top);
    printf("\n");
    }
}
void peek(){
    if(top==-1) {
        printf("Stack UnderFlow");
        printf("\n");}
    else{
        printf("The topmost element present in the satck is %d",stack[top]);
        printf("\n");
    }
}
void display(){
    if(top==-1) 
    {printf("Stack UnderFlow");
        printf("\n");}
    else{
        int i=top;
        while(i!=-1){
            printf("[%d] \n",stack[i--]);
        }
    }
}
int main(){
    int choice=0,value;
    while(choice!=5){
        printf("1.Push\n");
        printf("2.PoP\n");
        printf("3.Peek \n");
        printf("4.Display\n");
        printf("5.Exit\n");
        printf("Enter ur choice : ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter the value u want to push onto the stack : ");
                scanf("%d",&value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Exiting ... ... ...");
                break;
            default:
                printf("Invalid choice enter a valid choice again");
                break;
        }
    }
}