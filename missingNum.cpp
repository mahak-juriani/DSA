#include <iostream>
using namespace std;

#define int long

int32_t main()
{
    int n;
    cin>>n;
    
    int a[n-1];
    
    for(int i=0; i<n-1; i++)
    {
        cin>>a[i];
    }
    
    
    int sum = n*(n+1)/2;
    
    int list = 0;
    
    for(int i=0; i<n-1; i++)
    {
        list += a[i];
    }
    
    cout<< sum - list ;
    
    


    
}