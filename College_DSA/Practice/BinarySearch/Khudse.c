#include<stdio.h>
#include<stdlib.h>
struct tree{
    int data;
    struct tree*left,*right;
};
struct tree*create(int value){
   struct tree* newNode = (struct tree*) malloc(sizeof(struct tree));
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}
struct tree*insert(struct tree*root,int value){
    if(root==NULL) return create(value);
    else if(value<root->data) 
        root->left=insert(root->left,value);
    else if(value>root->data)
        root->right=insert(root->right,value);
    return root;
}
int search(struct tree*root,int value)
{
    if(root==NULL) return 0;
    if(root->data==value)return 1;
    else if(value<root->data) return search(root->left,value);
    else if(value>root->data) return search(root->right,value);
}
void inorder(struct tree*root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d \n",root->data);
        inorder(root->right);
    }
}
void postorder(struct tree*root){
    if(root!=NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d \n",root->data);
    }
}
void preorder(struct tree*root){
    if(root!=NULL){
        printf("%d \n",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}
void display(struct tree*root,int level){
    int i;
    if(root!=NULL){
        display(root->left,level+1);
        	printf("\n");
        for(i=0;i<level;i++){
            printf("    ");
        }
        printf("%d", root->data);
        display(root->right,level+1);
    }
}
int main() {
    struct tree* root = NULL;
    int choice, value;

    while (1) {
        printf("\n\n--- Binary Search Tree Menu ---\n");
        printf("1. Insert\n");
        printf("2. Search\n");
        printf("3. Inorder Traversal\n");
        printf("4. Preorder Traversal\n");
        printf("5. Postorder Traversal\n");
        printf("6. Display Tree Structure\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                root = insert(root, value);
                break;
            case 2:
                printf("Enter value to search: ");
                scanf("%d", &value);
                if (search(root, value))
                    printf("Value found in the tree.\n");
                else
                    printf("Value not found.\n");
                break;
            case 3:
                printf("Inorder Traversal: ");
                inorder(root);
                printf("\n");
                break;
            case 4:
                printf("Preorder Traversal: ");
                preorder(root);
                printf("\n");
                break;
            case 5:
                printf("Postorder Traversal: ");
                postorder(root);
                printf("\n");
                break;
            case 6:
                printf("Tree Structure:\n");
                display(root, 0);
                printf("\n");
                break;
            case 7:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice. Try again.\n");
        }
    }

    return 0;
}
