#include <iostream>
using namespace std;

class parent{
    public:
    void fun(){
        cout<<"hi guys";
    }
};
class child :public parent{
    public:
    void fun(){
        cout<<"bye guys";
    }
};
int main(){
    child obj;
    obj.fun();
}