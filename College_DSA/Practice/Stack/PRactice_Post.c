#include<stdio.h>
#include<ctype.h>
#include<string.h>
#define size 50
char stack[size];
int top=-1;
void push(char c){
    if(top<size-1) stack[++top]=c;
    else printf("Stack Overflow !");
}
char pop(){
    if(top>=0){
        return stack[top--];
    }
    else{
        printf("Stack Underflow !");
        return '\0';
    }
}
int precedence(char op){
    if(op=='*'||op=='/'||op=='%') return 2;
    if(op=='+'||op=='-') return 1;
    return 0;
}
void InfixToPostfix(char infix[],char Postfix[]){
    int i,j=0;
    char ch ;
    for(i=0;infix[i]!='\0';i++){
        ch=infix[i];
        if(isalnum(ch)) Postfix[j++]=ch;
        else if (ch == '(') {
            // Push '(' to stack
            push(ch);
        }
        else if(ch==')'){
            while(top!=-1 && stack[top] != '('){ // yahan humeinjtab tak pop karna h jab tak ek opening bracket encounter na hojaye
                Postfix[j++]=pop();
            }
            if(top!=-1) pop(); //iska mtlb h yeh loop ( bracket pe tuta h therefore humein usse bhi toh nikal na hogastack se
        }
        else{// yeh mein operater wali condidtion h
            while(top!=-1 && precedence(stack[top])>=precedence(ch)){
            Postfix[j++] = pop();
            }
            push(ch);
        }
    }
    while(top!=-1){
         Postfix[j++] = pop();
    }
    Postfix[j] = '\0';
}
void main(){
    char infix[size],Postfix[size];
    printf("Enter an infix expression with no space in between ");
    scanf("%s",&infix);
    InfixToPostfix(infix,Postfix);
    printf("The postfix expression of the entered infix expression is :%s",Postfix);
}