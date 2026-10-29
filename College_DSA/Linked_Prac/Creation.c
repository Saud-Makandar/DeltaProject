#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;//self referencing data type
    // yeh ek struct node type ka pointer h
};
struct Node *head = NULL, *ptr;
void create_list(int d) {
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
    temp->data = d;
    temp->next = NULL;
    if (head == NULL) {
        head = temp;
    } else {
        ptr = head;
        while (ptr->next != NULL)  ptr = ptr->next;
        ptr->next = temp;
    }
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
int main()
{
    create_list(5);
    create_list(10);
    create_list(15);
    display();
}
