// #include<stdio.h>
// int main(){
//     // int a;
//     // scanf("%d\n", &a);
//     // printf("%d\n", &a);
//     // int *p; //*p stores address of a int variable.
//     // p=&a;
//     // printf("%p\n", p);
//     // printf("%p\n", &a);

//     //Deference operator:
    
//     // char ch = 'a';  
//     // char *cp = &ch;
//     // printf("value at the address %p is %c \n", cp, *cp);


//     int num;
//     scanf("%d\n", num);
    
//     int *p = &num;
//     printf("value at the address %p is %d \n", p, *p);



// }




// #include <stdio.h>
// int main() {
// int num = 10;
// char c = 'T'; //ASCII value of T is 84
// int A;
// A = num + c;
// printf("Value of A : %d\n", A);
// int num1 = 20;
// double num2 = 50.3512897382 ;
// float B;
// B = num1 + (float)num2;
// printf("Value of B is: %f\n", B);
// return 0;}



// #include<stdio.h>
// int func(int n, int m){
// if(n == 0) return m;
// return func(n-1, m+1);
// }
// int main(){
// int n = 4, m = 5;
// printf("%d\n", func(n, m));
// return 0;
// }



// #include <stdio.h>
// #include <ctype.h>
// int main()
// {
// int size, i = 0;
// char name[50];
// printf("Enter a string: ");
// scanf("%s", name);
// while (name[i] != '\0') {
// i++;
// }
// size = i;
// printf("\nOriginal Name: %s\n", name);
// for (i=0;i<size; i++) {
// if (i%2==0) {
//     if (!isupper(name[i])) {
// name[i] = toupper(name[i]);
// }
// } else {
// if (!islower(name[i])) {
// name[i] = tolower(name[i]);
// }
// }
// }
// printf("Alternate Toggled Name: %s\n", name);
// return 0;
// }


// #include<stdio.h>
// struct Distance {
// int feet;
// int inch;
// } dist1, dist2, sum;
// void add_dist()
// {
// // Code to add the two distances
// sum.feet= dist1.feet+dist2.feet;
// sum.inch = dist1.inch+dist2.inch;
// // Code to convert inches to feet if greater than 12
// while (sum.inch >= 12) {
//     sum.inch -= 12;
//     sum.feet++;
// }
// printf("\nSum of distances = %d feet,%d inches", sum.feet,
// sum.inch);
// }

// #include <stdio.h>
// int main()
// {
// int arr[] = {2, 4, 6, 8, 10};
// int *ptr = arr + 4;
// int *ptr1 = arr;
// int *ptr2 = arr + 3;
// printf("A :%d\n", *ptr);
// printf("B : %d\n", *ptr--);
// printf("C : %d\n", *ptr);
// printf("D : %ld\n", ptr2 - ptr1);
// printf("E : %d\n", *ptr2 - *ptr1);
// return 0;
// }



// #include <stdio.h>
// void modifyArrayByValue(int a[], int size) {
// for (int i = 0; i < size; i++) {
// a[i] *= 2;
// }}
// void modifyArrayByReference(int *a, int size) {
// for (int i = 0; i < size; i++) {
// *(a + i) *= 2;
// }}
// int main() {
// int arr[5] = {1, 2, 3, 4, 5};
// int size = sizeof(arr) / sizeof(arr[0]);
// printf("A : Array elements before modification by value: \n");
// for (int i = 0; i < size; i++) {
// printf("%d ", arr[i]);
// }
// printf("\n");
// modifyArrayByReference(arr, size);
// printf("B : Array elements after modification by reference: \n");
// for (int i = 0; i < size; i++) {
// printf("%d ", arr[i]);
// }
// printf("\n");
// modifyArrayByValue(arr, size);
// printf("C: Array elements after modification by value: \n");
// for (int i = 0; i < size; i++) {
// printf("%d ", arr[i]);
// }
// printf("\n");
// return 0;
// }



#include <stdio.h>
/* Global variable */
int global = 20;
void func1() {
int local = 10;
static int static_var = 30;
printf("C : Local variable in func1: %d\n", local);
printf("D : Static variable in func1: %d\n", static_var);
local += 10;
static_var += 10;
}
void func2() {
int local = 100;
static int static_var = 300;
printf("E : Local variable in func2: %d\n", local);
printf("F : Static variable in func2: %d\n", static_var);
local += 100;
static_var += 100;
}
int main() {
int local = 1;
printf("A : Local variable in main: %d\n", local);
printf("B : Global variable in main: %d\n", global);
local += 1;
global += 1;
func1();
func2();
printf("G : Local variable in main: %d\n", local);
printf("H : Global variable in main: %d\n", global);
return 0;
}