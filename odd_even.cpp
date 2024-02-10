#include<iostream>
using namespace std;
void fun(long long int);
int main(){
    long long int num;
    cout<<"enter the number : ";
    cin>>num;
    cout<<num;
    fun(num);
    return 0;
}
void fun(long long int num){
    
    if(num%2==0)
    
        cout<<" is even!";
    else
        cout<<" is odd!";
}