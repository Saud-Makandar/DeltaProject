#include<stdio.h>
#include<stdlib.h>
struct Tree{
    int data;
    struct Tree* left,*right;    
};
struct Node* createNode(int value) {
    struct Tree* newNode = (struct Tree*) malloc(sizeof(struct Tree));
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}
struct Tree*insert(struct Tree*root,int value){
    struct Tree*newNode=(struct Tree*)malloc(sizeof(struct Tree));
    if(root==NULL) return createNode( value);
    else if(value<root->data) root=insert(root->left,value);
    else if(value>root->data) root = insert(root->right,value);
    return root;
}
int search(struct Tree*root,int key){
    if(root==NULL) printf("Element hai hi nhi");
    if(root->data==key) return 1;
    else {
        if(root->data>key) return search(root->left,key);
        else return search(root->right,key);
    }
}
void inorder(struct Tree*root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d",root->data);
        inorder(root->right);
    }
}
void display(struct Tree * root, int level){

}