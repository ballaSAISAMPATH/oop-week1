#include<iostream>
using namespace std;

class student{
    public :
        string fullName;
        int rollNum;
        double semPerentage;
        string collegeName;
        int collegeCode;

    student(){
        
           fullName = "SAM";
            rollNum = 11;
            semPerentage = 92.1;
            collegeName = "MAHARAJ VIJAYRAM GAJAPATHIRAJ COLLEGE OF ENGINEERING";
            collegeCode = 01;
    }
    ~ student(){}
};
int main (){
    student sam;
    cout<<"name : "<<sam.fullName<<"\nroll no. : "<<sam.rollNum<<"\npercentage : "<<sam.semPerentage<<"\ncollege name : "<<sam.collegeName<<"\ncollege code : "<<sam.collegeCode<<endl;
}