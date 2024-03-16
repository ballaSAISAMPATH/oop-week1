//Demonstrate Operator overloading in C++.
#include<iostream>
using namespace std;

class Operation{
    public:
    int num1=0;
    int num2=0;

    Operation operator +(Operation obj) {
        Operation temp;
        temp.num1=num1+obj.num1;
        temp.num2 =num2+ obj.num2;
        return temp;
    }
    void set(int a,int b){
        num1=a;
        num2=b;
    }

};

int main(){
    Operation obj1,obj2,obj3;
    obj1.set(2,3);
    obj2.set(4,2);
    obj3 = obj1+obj2;
    cout<<obj3.num1<<" "<<obj3.num2;
}