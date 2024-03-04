#include<iostream>
using namespace std;

class mother{
    public:
    string money = "1 million USD";
    string morals = "trust none";
};

class son1 : public mother{public:string car="AUDI";}; 
class son2 : public mother{public :string bike ="BMW";};
class frnd : public son1,public son2{};

int main(){
    frnd xyz;
    son1 sam;
    son2 sai;
    cout<<"FIRST son :"<<endl;
    cout<<"money inherited = "<<sam.money<<endl;
    cout<<"morals = "<<sam.morals<<endl<<endl;
    cout<<"SECOND son :"<<endl;
    cout<<"money inherited = "<<sai.money<<endl;
    cout<<"morals = "<<sai.morals<<endl<<endl;
    cout<<"Inheritance by a common friend: "<<endl;
    cout<<"bike  = "<<xyz.bike<<endl;
    cout<<"car = "<<xyz.car<<endl<<endl;
}
