#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node*left,*right;
};
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}
struct Node* insert(struct Node* root, int value) {
    if (root == NULL) return createNode(value);
    if (value < root->data)
        root->left = insert(root->left, value);
    else if (value > root->data)
        root->right = insert(root->right, value);
    return root;
}
int search(struct Node* root, int value) {
    if (root == NULL) return 0;
    if (value == root->data) return 1;
    if (value < root->data)
        return search(root->left, value);
    else
        return search(root->right, value);
}
void inorder(struct Node* root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}