//Demonstrate Simple Inheritance in CPP using a real time example.
#include<iostream>
using namespace std;

class Father{
    public :
    string inheritance = "1 million USD";
    string surname= "balla";
};

class Son : public Father{
};

int main(){
    Son sam;
    cout <<"inherited amount : " << sam.inheritance<<endl;
    cout << "inherited surname : "<< sam.surname<< endl;
}
