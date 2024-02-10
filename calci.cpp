#include <iostream>
using namespace std;
int main(){
    float a,b;
    int choice,check=1;
    while (check!=0){
        cout<< "enter the first number : ";
        cin>>a;
        cout<<"enter the second number : ";
        cin>>b;
        cout<< "enter your choice number of operation :-\n1-addition\n2-substraction\n3-multiplication\n4-division\n5.remainder\nenter here : ";
        cin>>choice;
        cout<<"\n\n\n";
        switch (choice){ 
            case 1:cout<<"addition of "<<a<<" + "<<b<<" is "<<a+b;break;
            case 2:cout<<"substraction of "<<a<<" - "<<b<<" is "<<a-b;break; 
            case 3:cout<<"multiplication of "<<a<<" * "<<b<<" is "<<a*b;break;
            case 4:cout<<"division of "<<a<<" / "<<b<<" is "<<a/b;break;
            case 5:cout<<"remainder of "<<a<<" to "<<b<<" is "<<int(a)%int(b);break;
            default: cout<< "invalid choice..try again\n";
        }

        cout<<"\n\npress 0 to exit \nor any other number to reperform the calculation. \n";
        cin>>check;
        if(check==0)
            break;
        
    }
    
}