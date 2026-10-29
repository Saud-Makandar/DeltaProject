#include<stdio.h>
#include<stdlib.h>//to include the malloc function in to my code
struct Node
{
    int data;
    struct Node* next;//self referencing pointer
}*start=NULL,*ptr;
void create(int val)
{
    struct Node* link;
    link= malloc(sizeof(struct Node));
    link->data=val;
    link->next=NULL;
    if(start==NULL)
    {
        //This is the very first node;
        start=link;
    }
    else{
        ptr=start;
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        ptr->next=link;
    }
}
void display()
{
    if(start==NULL) printf("No Linked List Exist ");
    else{
        ptr=start;
        while(ptr!=NULL)
        {
            if(ptr->next!=NULL){
            printf("%d -> ",ptr->data);
            ptr=ptr->next;
            }
            else{
                printf("%d ",ptr->data);
                ptr=ptr->next;
            }
        }
    }
}
void insertBef(int val,int target)
{
    if(start==NULL)printf("The Linked List is Empty");
    struct Node* link = malloc(sizeof(struct Node));
    struct Node* temp=start;
    if(start->data==target) // i will call a function to insert it in the begining 
    {
    return;
    }
    ptr=start->next;
    link->data=val;
    while(ptr->data!=target)
    {
        temp=ptr;
        ptr=ptr->next;
    }
    //the moment the loop break it means we are at the desired data
    temp->next=link;
    link->next=ptr;
}
void insertafter(int val,int target)
{
    if (start==NULL) return;
    struct Node* link;
    link=malloc(sizeof(struct Node));
    link->data=val;
    ptr=start;
    while(ptr->data!=target)
    {
        ptr=ptr->next;
    }
    link->next=ptr->next;
    ptr->next=link;

}
int main()
{
    printf("Let's create a linked List\n");
    printf("Enter the initial no of elements u need to be insert in ur Linked List -> ");
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        printf("Enter the value need to be inserted -> ");
        int value;
        scanf("%d",&value);
        create(value);
    }
    display();
    /*printf("Enter the element u want to insert ");
    int insert;
    scanf("%d",&insert);
    printf("Enter the target valku need to insert before that ");
    int target;
    scanf("%d",&target);
    insertBef( insert, target);
    display();*/
    printf("Enter the element u want to insert ");
    int insert1;
    scanf("%d",&insert1);
    printf("Enter the target valku need to insert before that ");
    int target1;
    scanf("%d",&target1);
    insertafter(insert1,target1);
    display();
}