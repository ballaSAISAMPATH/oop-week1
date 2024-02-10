#include<iostream>
#include<iomanip>
using namespace std;
int main(){
    cout<<"///endl example: ";
    cout<<"hello everyone"<<endl;
    cout<<"///ends example: ";
    cout<<"what's for the supper?"<<ends<<endl;
    cout<<"///setw example: ";
    cout<<setw(10)<<"output\n";
    cout<<"///setfill example: ";
    cout<<"setting fill:\n"<<setfill('#')<<setw(30)<<"Good evening\n";
    cout<<"///setprecision example: ";
    cout<<"actual number -12.43434534534543453453453453453 \nafter setting precision - "<<setprecision(10)<<12.43434534534543453453453453453<<endl;
    cout<<"///flush example: ";
    cout<<"hello"<<flush;
}