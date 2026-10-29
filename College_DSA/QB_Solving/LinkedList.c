#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node *head, *ptr;

void createLast(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;

    if (head == NULL)
        head = newNode;
    else {
        ptr = head;
        while (ptr->next != NULL)
            ptr = ptr->next;
        ptr->next = newNode;
    }
}

void insertBeg(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = head;
    head = newNode;
}

void deleteEnd() {
    if (head == NULL)
        printf("Khali Hai\n");
    else if (head->next == NULL) {
        free(head);
        head = NULL;
    } else {
        ptr = head;
        struct Node* prev;
        while (ptr->next != NULL) {
            prev = ptr;
            ptr = ptr->next;
        }
        prev->next = NULL;
        free(ptr);
    }
}

void deleteBeg() {
    if (head == NULL)
        printf("Khali Hai\n");
    else {
        ptr = head;
        head = head->next;
        free(ptr);
    }
}

void search(int target) {
    if (head == NULL)
        printf("Khali Hai\n");
    else {
        ptr = head;
        while (ptr != NULL) {
            if (ptr->data == target) {
                printf("Oye MilgayaOye !\n");
                return;
            }
            ptr = ptr->next;
        }
        printf("Nahi Mila Bhai\n");
    }
}

void count(int target) {
    int count = 0;
    if (head == NULL)
        printf("Khali Hai\n");
    else {
        ptr = head;
        while (ptr != NULL) {
            if (ptr->data == target)
                count++;
            ptr = ptr->next;
        }
        printf("Count of %d is: %d\n", target, count);
    }
}

void display() {
    if (head == NULL)
        printf("Linked List is empty.\n");
    else {
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
    int choice, value, target;

    while (1) {
        printf("\n--- Linked List Menu ---\n");
        printf("1. Insert at End\n");
        printf("2. Insert at Beginning\n");
        printf("3. Delete from End\n");
        printf("4. Delete from Beginning\n");
        printf("5. Search Element\n");
        printf("6. Count Occurrences\n");
        printf("7. Display List\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert at end: ");
                scanf("%d", &value);
                createLast(value);
                break;
            case 2:
                printf("Enter value to insert at beginning: ");
                scanf("%d", &value);
                insertBeg(value);
                break;
            case 3:
                deleteEnd();
                break;
            case 4:
                deleteBeg();
                break;
            case 5:
                printf("Enter value to search: ");
                scanf("%d", &target);
                search(target);
                break;
            case 6:
                printf("Enter value to count: ");
                scanf("%d", &target);
                count(target);
                break;
            case 7:
                display();
                break;
            case 8:
                exit(0);
            default:
                printf("Invalid choice. Try again.\n");
        }
    }

    return 0;
}