#include<iostream>
using namespace std;
template <typename type>
type calci(type x,type y){
    int choice;
    cout <<"enter : 1 - addition , 2 - substraction "<<endl<<"3 - multiplication , 4 - division"<<endl<<"5 - remainder"<<endl<<"enter here : ";
    cin>>choice;
    switch (choice)
    { 
    case (1):return x+y;
        break;
    case (2):return x-y;
        break;
    case (3):return x*y;
        break;
    case (4):return x/y;
            break;
    case (5):return int(x)%int(y);
            break;
    default:
        cout<<"invalid operator"<<endl;
        return int(NULL);
        break;
    }
}
int main(){
    double num1,num2;
    cout<<"enter the two operands : ";
    cin>>num1>>num2;
    double result=calci<double>(num1,num2);
    if (result==int(NULL))
        cout<<"no result!!";
    else
        cout<<result<<endl;
    return 0;
}

