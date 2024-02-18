#include<stdio.h>
struct Point{
    int x;
    int y;
};

typedef struct
{
    
};



int main(){
    struct Point p1 = {1,2};
    printf("%d, %d\n", p1.x, p1.y);
    struct Point p2;
    p2=p1;
    printf("%d, %d\n", p2.x, p2.y);
    p2.x=100;
    printf("%d, %d \n", p2.x, p2.y);
    printf("%d, %d \n", p1.x, p1.y);

}