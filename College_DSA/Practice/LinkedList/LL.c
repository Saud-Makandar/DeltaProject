#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
struct Node{
    int data;
    struct Node*next;
};
struct Node*head,*ptr;// head or ptr se hi hum apne LL mein operations perform karienge
void create(int value){// insetion at the end
    struct Node*newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=value;
    newnode->next=NULL;
    if(head==NULL){
        head=newnode;
    }
    else{
        ptr=head;
        while(ptr->next!=NULL){
            ptr=ptr->next;
        }
        ptr->next=newnode;
    }
}
void insert_beg(int value){
    struct Node*newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=value;
    newnode->next=head;
    head=newnode;
}
void insert_after(int value){
    struct Node*newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=value;
    int key;
    printf("Enter the value of Key : ");
    scanf("%d",&key);
     ptr=head;
     while(ptr != NULL && ptr->data!=key){
        ptr=ptr->next;
     }
     if(ptr!=NULL){
     newnode->next=ptr->next;
     ptr->next=newnode;
     }
     else  printf("Key not found. Insertion failed.\n");
     free(newnode);
}
void insert_bef(int value){
    struct Node*newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=value;
    int key;
    printf("Enter the value of Key : ");
    scanf("%d",&key);
    ptr=head;
    struct Node*prevptr=NULL;
    while(ptr!=NULL&&ptr->data!=key){
            prevptr=ptr;
            ptr=ptr->next;
    }
    newnode->next=ptr;
    if(prevptr==NULL)
    head=newnode;// yeh phir insertion from begining ka case ban jayega
    else  prevptr->next=newnode;
}
void delete_beg(){
    if(head!=NULL){
        ptr=head;
        head=head->next;
        free(ptr);
    }
    else{
        printf("Linked List is empty");
    }
}
void delete_end(){
    struct Node*prevptr=NULL;
    if(head==NULL){
         printf("Linked List is empty");
    }
    else{
        while(ptr->next!=NULL)// humein second last node tak ptr ko lekar jana h
        {
            prevptr=ptr;
            ptr=ptr->next;
        }
        prevptr->next=NULL;
        free(ptr);
    }
}
void delete_befor(int key){
    if(head==NULL){
        printf("LL is Empty");
    }if(key==head->data){
      printf("Node node is present before a given node");
      return;
    }
    else {
        ptr=head;
        struct Node*prevpre=NULL;
        struct Node* prevptr=NULL;
        while(ptr!=NULL&&ptr->data!=key){
                prevpre=prevptr;   
                prevptr=ptr;
                ptr=ptr->next;
        }
        if(ptr!=NULL){
           prevpre->next=ptr;
           prevptr->next=NULL;
           free(prevptr);
        }
        else{
            // key not found case;
        }
    }
}
void delete_after(int key) {
    if (head == NULL) {
        printf("Linked List is empty\n");
        return;
    }

    ptr = head;

    // Traverse to the node with the given key
    while (ptr != NULL && ptr->data != key) {
        ptr = ptr->next;
    }

    // If key not found or no node after key
    if (ptr == NULL || ptr->next == NULL) {
        printf("No node exists after the given key. Deletion failed.\n");
        return;
    }

    // Delete the node after ptr
    struct Node* temp = ptr->next;
    ptr->next = temp->next;
    free(temp);
}
void display() {
    if (head == NULL) {
        printf("Linked List is empty.\n");
    } else {
        ptr = head;
        printf("List contents: ");
        while (ptr != NULL) {
            printf("%d -> ", ptr->data);
            ptr = ptr->next;
                }
        printf("NULL\n");
            }
    }
int main() {
    int choice = 0, n, val, key, i;

    while (choice != 11) {
        printf("\n--- Linked List Operations ---\n");
        printf("1. Insert at End\n");
        printf("2. Insert at Beginning\n");
        printf("3. Insert After a Node\n");
        printf("4. Insert Before a Node\n");
        printf("5. Delete at Beginning\n");
        printf("6. Delete at End\n");
        printf("7. Delete Before a Node\n");
        printf("8. Delete After a Node\n");
        printf("9. Display List\n");
        printf("10. Exit\n");
        printf("-----------------------------\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the number of nodes: ");
                scanf("%d", &n);
                for (i = 0; i < n; i++) {
                    printf("Enter value for node %d: ", i + 1);
                    scanf("%d", &val);
                    create(val);
                }
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &val);
                insert_beg(val);
                break;
            case 3:
                printf("Enter value to insert: ");
                scanf("%d", &val);
                insert_after(val);
                break;
            case 4:
                printf("Enter value to insert: ");
                scanf("%d", &val);
                insert_bef(val);
                break;
            case 5:
                delete_beg();
                break;
            case 6:
                delete_end();
                break;
            case 7:
                printf("Enter key before which to delete: ");
                scanf("%d", &key);
                delete_befor(key);
                break;
            case 8:
                printf("Enter key after which to delete: ");
                scanf("%d", &key);
                delete_after(key);
                break;
            case 9:
                display();
                break;
            case 10:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid operation entered.\n");
        }
    }

    return 0;
}


