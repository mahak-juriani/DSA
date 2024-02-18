#include<stdio.h>
#include<ctype.h>   //in this library there are functions to work on characters like:
                        //isdigit(), isalpha(), isupper(), islower() etc
#include<string.h>  //functions to work on strings like:
                        //strlen(B); {finds the length of the string}, strcpy(D, B); {if two strings are given S1 and S2,
                        //                                                             this functin copies S2 to S1}
                        //strstr(D, B); {checks whether S1 is a substring of S2 or not}
                        //strcmp(D, B); {if S1 and S2 are equal i.e. every character is same and even the length is same. Then it would 
                        //                    return 0, if two strings are not equal then it would return either a positive number or a 
                        //                      negative number. It would give positive number if S1>S2 and negative if S1<S2.}
                        // Example: S1:aaabcd
                        //          S2:z
                        //Here S2 is greater than S1 as ascii value of z is greater than a.
                        //strcat(S1, S2); {Concatinates S2 to S1}
                        //atoi(str)=> int {convert string to integer}
                        //atof(str)=> float {convert string to float}



//Check if a number is a armstrong number
// int isArmstring(int n){
//     int sum = 0;
//     int num = n;
//     while(n>0){
//         int d = n%10;
//         int digitCube = d*d*d;
//         sum+=digitCube;
//         n=n/10;
//     }
//     if(num==sum){
//         return 1;
//     }
//     return 0;
// }


//Given an array, count the number of armstrong numbers in array
// int count_of_armstrong_nos(int A[]){
//     int n = (int)(sizeof(A)/sizeof(A[0]));
//     int i;
//     int count=0;
//     for(i=0; i<n; i++){
//         if(isArmstring(A[i])){
//             count++;
//         }
//     }
    // return count;
// }

//How to scan a string




int main(){
    // int a;
    // scanf("%d", &a);
    // printf("%d", isArmstring(a));
    // char str1[10];
    // char str2[10];
    // scanf("%s\n", str1);
    // scanf("%s\n", str2);
    // printf("%d", strcmp(str1, str2));


    struct student {
        
    }
}