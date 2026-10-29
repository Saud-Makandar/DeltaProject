#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node * start=NULL,*ptr;
void create(int value){
    struct Node *temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data = value;
    temp->next=NULL;
    if(start==NULL){
        start=temp;
    }
    else{
        ptr=start;
        while(ptr->next!=NULL) {
            ptr=ptr->next;
        }
        ptr->next=temp;
    }

}
void display(){
    if(start==NULL){
        printf("There is no such LL");
    }
    else{
        ptr=start;
         while(ptr!=NULL){
            printf(" %d -> ",ptr->data);
            ptr=ptr->next;
         }
         printf("NULL");
    }
}
int main()
{
    create(6);
    create(23);
    create(24);
    create(25);
    create(30);
    create(38);
    display();
}