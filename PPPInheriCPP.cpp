/*Demonstrate the following :
1. Private Inheritance
2. Protected Inheritance
3. Public Inheritance*/

#include<iostream>
using namespace std;

class mother {
    string vehicles= "BMX-xR";
    public:
    void vehicle(){
        cout << "vehicle : BMX-xR"<<endl;
    }
    string morals = "always be open minded";
    protected:
    string money = "1 million USD";
};
class son1 :public mother{
    public:
    void Money(){
        cout<<money<<endl;
    }
};
int main(){
    son1 sam;
    sam.vehicle();
    cout<<sam.morals<<endl;
    sam.Money();

}
