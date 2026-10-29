#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

struct Node *head = NULL, *ptr;

// Insert at end
void create_list(int d) {
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
    temp->data = d;
    temp->next = NULL;

    if (head == NULL) {
        head = temp;
    } else {
        ptr = head;
        while (ptr->next != NULL)
            ptr = ptr->next;
        ptr->next = temp;
    }
}

// Insert at beginning
void insert_at_begin(int d) {
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
    temp->data = d;
    temp->next = head;
    head = temp;
}

// Insert after a node
void insert_between(int d) {
    int key;
    printf("Enter the node value after which to insert: ");
    scanf("%d", &key);
    ptr = head;
    while (ptr != NULL && ptr->data != key)
        ptr = ptr->next;
    if (ptr != NULL) {
        struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
        temp->data = d;
        temp->next = ptr->next;
        ptr->next = temp;
    } else {
        printf("Node %d not found.\n", key);
    }
}

// Delete at beginning
void del_at_begin() {
    if (head != NULL) {
        ptr = head;
        head = head->next;
        free(ptr);
    } else {
        printf("List is empty.\n");
    }
}

// Delete at end
void del_at_end() {
    struct Node *prev = NULL;
    ptr = head;
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    if (head->next == NULL) {
        free(head);
        head = NULL;
        return;
    }
    while (ptr->next != NULL) {
        prev = ptr;
        ptr = ptr->next;
    }
    prev->next = NULL;
    free(ptr);
}

// Delete specific node
void del_in_between() {
    int key;
    printf("Enter the node value to delete: ");
    scanf("%d", &key);
    struct Node *prev = NULL;
    ptr = head;
    while (ptr != NULL && ptr->data != key) {
        prev = ptr;
        ptr = ptr->next;
    }
    if (ptr != NULL) {
        if (prev == NULL)
            head = ptr->next;
        else
            prev->next = ptr->next;
        free(ptr);
    } else {
        printf("Node %d not found.\n", key);
    }
}

// Search for a node
void search() {
    int key, found = 0;
    printf("Enter value to search: ");
    scanf("%d", &key);
    ptr = head;
    while (ptr != NULL) {
        if (ptr->data == key) {
            printf("Element %d found.\n", key);
            found = 1;
            break;
        }
        ptr = ptr->next;
    }
    if (!found)
        printf("Element %d not found.\n", key);
}

// Count occurrences
void count() {
    int key, c = 0;
    printf("Enter value to count occurrences: ");
    scanf("%d", &key);
    ptr = head;
    while (ptr != NULL) {
        if (ptr->data == key)
            c++;
        ptr = ptr->next;
    }
    printf("Occurrences of %d = %d\n", key, c);
}

// Display list
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

// Main function
int main() {
    int choice = 0, n, val, i;

    while (choice != 10) {
        printf("\n--- Linked List Operations ---\n");
        printf("1. Insert at End\n");
        printf("2. Insert at Beginning\n");
        printf("3. Insert After a Node\n");
        printf("4. Delete at Beginning\n");
        printf("5. Delete at End\n");
        printf("6. Delete a Specific Node\n");
        printf("7. Search for a Node\n");
        printf("8. Count Occurrences\n");
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
                    create_list(val);
                }
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &val);
                insert_at_begin(val);
                break;
            case 3:
                printf("Enter value to insert: ");
                scanf("%d", &val);
                insert_between(val);
                break;
            case 4:
                del_at_begin();
                break;
            case 5:
                del_at_end();
                break;
            case 6:
                del_in_between();
                break;
            case 7:
                search();
                break;
            case 8:
                count();
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