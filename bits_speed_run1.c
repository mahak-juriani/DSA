#include<stdio.h> 
//to assign a constant value to a variable
//1. define method
//2. const float pi method
//#define pi 3.14 // variable pi can't be changed after this
int main(){

    // int a;
    // scanf("%d", &a);
    // printf("My age is %d\n", &a);

    //Types of errors:
    //1. Compile time error 
    //2. Run time error
    //3. Semantics/ Logic


    // const float pi = 3.14;

    //What happens if we scan a constant.
    // const int b=50;
    // scanf("%d", &b);
    // printf("My age is %d\n", b);


    //Type of operators:
    //1. Arithematic(- + * /)
    //2. Relational(==, <=, >=, <, >, !=)
    //3. Logical(&&, ||, !)
    //4. Assignment(=)

    int a = 10, d = 10;
    int b = a++;
    int c = ++a;
    //What would be the value of b and c?
    //a++/a-- => current vlaue of a will be used then the increment takes place.
    //++a/--a => first a will increment and then will be assigned.




}
