#include<stdio.h>
#include<ctype.h>
#include<string.h>
#define Max 50
char stack[Max];
int top=-1;
void push(char c){
    if(top<Max-1){
        stack[++top]=c;
    }
    else printf("Chomu lol");
}
char pop(){
    if(top==-1){
        printf("Khali Baati ");
        return '\0'; 
    }
    else {
        return stack[top--];
    }
}
int precedence(char op) {
    if (op == '*' || op == '/' || op == '%')  // High precedence operators
        return 2;
    if (op == '+' || op == '-')                // Low precedence operators
        return 1;
    return 0;  // Non-operators get zero precedence
}
void infixTOpostfix(char infix[Max],char postfix[Max]){
    int i,j=0;
    char ch;
    for(i=0;infix[i]!='\0';i++){
        ch=infix[i];
        if (isalnum(ch)) {      // If character is operand (letter or digit)
            postfix[j++] = ch;
        }else if (ch == '(') { // If character is left parenthesis
            push(ch);
        }
        else if(ch == ')'){
            while (top != -1 && stack[top] != '(') {
                postfix[j++] = pop();
            }
            if (top != -1) pop(); // Remove the '(' from the stack
        } 
        else{// character is an operator
            while (top != -1 && precedence(stack[top]) >= precedence(ch)) {
                postfix[j++] = pop();
            }
            push(ch);
        }
    }
     while (top != -1) {
        postfix[j++] = pop();
    }
    postfix[j] = '\0'; // Null terminate postfix expression string
}
 int main() {
    char infix[Max], postfix[Max];
    printf("Enter an infix expression (no spaces): ");
    scanf("%s", infix);          // Read infix expression as a single word (no spaces)
    infixTOpostfix(infix, postfix); // Convert infix to postfix
    printf("Postfix expression: %s\n", postfix);
    return 0;
}
