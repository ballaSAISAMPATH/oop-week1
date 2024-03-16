#include<iostream>
using namespace std;

class add{
    public:
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
};

int main(){
    add num;
    cout<<num.sum(1,2)<<endl;
    cout<<num.sum(1,2,3);
};
