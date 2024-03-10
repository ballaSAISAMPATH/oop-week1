#include<iostream>
using namespace std;

class AccessSpecifierDemo{
     protected: int proVar;
     private: int priVar;
     public: int pubVar;

    public:
     void setVar(int priValue,int proValue, int pubValue){
        this->priVar=priValue;
        this->proVar=proValue;
        this->pubVar=pubValue;
     }
     void getVar(){
        cout<<"private variable value :"<<priVar<<endl;
     }
};

class Sub : public AccessSpecifierDemo{
    public:
    void getVar(){
        cout<<"protected variable value : "<<proVar<<endl;
    }
};

int main (){
    AccessSpecifierDemo obj;
    Sub obj1;
    cout<<"enter the private, protected and public values in order : ";
    int privalue,provalue,pubvalue;
    cin>>privalue>>provalue>>pubvalue;
    obj.setVar(privalue,provalue,pubvalue);
    obj1.setVar(privalue,provalue,pubvalue);
    obj.getVar();
    obj1.getVar();
    cout<<"public variable value :"<<obj.pubVar<<endl;
}
