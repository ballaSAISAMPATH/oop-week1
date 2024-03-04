#include<iostream>
using namespace std;

class mother{
    public:
    string money = "1 million USD";
    string morals = "trust none";
};

class son1 : public mother{public:string surname="surname";}; 
class son2 : public mother{public :string bike ="BMW";};
class son3 : public mother{public :string car ="AUDI";};
class grandson :public son1{};
class frnd : public son3,public son2{};
int main(){
    cout<<"SIMPLE :"<<endl;
    son1 sam;
    son2 sai;
    son3 sampath;
    grandson abc;
    frnd xyz;
    cout<<"money inherited = "<<sam.money<<endl;
    cout<<"morals = "<<sam.morals<<endl<<endl;

    cout<<"HIERARCIAL :"<<endl;
    cout<<"FIRST son :"<<endl;
    cout<<"money inherited = "<<sam.money<<endl;
    cout<<"morals = "<<sam.morals<<endl;
    cout<<"SECOND son :"<<endl;
    cout<<"money inherited = "<<sai.money<<endl;
    cout<<"morals = "<<sai.morals<<endl;
    cout<<"FIRST son :"<<endl;
    cout<<"money inherited = "<<sampath.money<<endl;
    cout<<"morals = "<<sampath.morals<<endl<<endl;


    cout<<"MULTILEVEL :"<<endl;
    cout<<"FIRST son :"<<endl;
    cout<<"money inherited = "<<abc.money<<endl;
    cout<<"morals = "<<abc.morals<<endl;
    cout<<"GRANDSON :"<<endl;
    cout<<"surname = "<<abc.surname<<endl<<endl;

    cout<<"HYBRID :"<<endl;
    cout<<"FIRST son :"<<endl;
    cout<<"money inherited = "<<sam.money<<endl;
    cout<<"morals = "<<sam.morals<<endl;
    cout<<"SECOND son :"<<endl;
    cout<<"money inherited = "<<sai.money<<endl;
    cout<<"morals = "<<sai.morals<<endl;
    cout<<"FRIEND:"<<endl;
    cout<<"bike  = "<<xyz.bike<<endl;
    cout<<"car = "<<xyz.car<<endl<<endl;

    cout<<"MULTIPLE :"<<endl;
    cout<<"FRIEND:"<<endl;
    cout<<"bike  = "<<xyz.bike<<endl;
    cout<<"car = "<<xyz.car<<endl;
}