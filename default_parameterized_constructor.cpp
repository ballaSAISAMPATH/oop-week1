#include<iostream>
using namespace std;
class student{
    public :
        string fullName;
        double semPercentage;
        string collegeName;
        int collegeCode;

    student(){
            collegeName = "MAHARAJ VIJAYRAM GAJAPATHIRAJ COLLEGE OF ENGINEERING";
            collegeCode = 01;
    } 
    student(string Name,double Percentage){
        fullName=Name;
        semPercentage=Percentage;
        
    }
    ~student(){}
};
int main(){
    string fullName;
    double semPercentage;
    cout<<"enter your name and percentage :\n";
    cin>>fullName>>semPercentage;
    student sam;
    cout<<"college name : "<<sam.collegeName<<endl;
    cout<<"college code : "<<sam.collegeCode<<endl;
    student sampath(fullName,semPercentage);
    cout<<"name : "<<sampath.fullName<<"\npercentage : "<<sampath.semPercentage<<endl;
}