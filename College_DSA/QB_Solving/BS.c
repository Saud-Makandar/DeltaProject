#include<stdio.h>
struct Tree{
    int data;
    struct Tree*left,*right;
};
struct Tree*create(int value){
    struct Tree*newNode=(struct Tree*)malloc(sizeof(struct Tree));
    newNode->data=value;
    newNode->left=newNode->right=NULL;
    return newNode;
}
struct Tree*insert(struct Tree*root , int value){
    if(root==NULL) return create(value);
    else if(root->data<value) root=insert(root->left,value);
    else if(root->data>value) root=insert(root->right,value);
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
void preorder(struct Tree*root){
    if(root!=NULL){
        printf("%d",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}
void postorder(struct Tree*root){
    if(root!=NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d",root->data);
    }
}
void display(struct Tree* root,int level){
    int i;
	if ( root!=NULL ){
        display(root->left,level);
        printf("\n");
        for (i = 0; i < level; i++)
			printf("    ");
        printf("%d", root->data);
		display(root->left, level+1);
    }
}
