#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node *Top=NULL,*ptr;
void push(int data){
    struct Node *temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=data;
    temp->next=NULL;
    if(Top==NULL){
        Top=temp;
    }
    else{
        temp->next=Top;
        Top=temp;
    }
}
void pop(){
     if(Top==NULL) printf("Stack Underflow ... ... ...");
    else{
        ptr=Top;
        Top=Top->next;
        printf("Element %d is popped out from the stack ...\n", ptr->data);
        free(ptr);
    }
}
void display()
{
    if(Top==NULL) printf("Stack Underflow ... ... ...");
    else{
        ptr=Top;
        while(ptr!=NULL)
        {
            printf("%d",ptr->data);
            printf("\n");
            ptr=ptr->next;
        }
    }
}
int main()
{
    int choice , d;
    while(choice!=-1){
        printf("1. Perform push operaction");
        printf("\n");
        printf("2. Perform pop operation");
        printf("\n");
        printf("Display the created stack ... ... ...");
        printf("\n");
        printf("Enter your choice -> ");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            printf("Enter the value need to be push on the stack");
            printf("\n");
            scanf("%d",&d);
            push(d);
            break;
        case 2:
            printf("Performing pop operation ");
            printf("\n");
            pop();
            break;
        case 3:
            printf("Displayin the stack : ");
            printf("\n");
            display();
            printf("\n");
            break;
        default:
            printf("Exiting the program ... ... ...");
            break;
        }
    }
    return 0;
}