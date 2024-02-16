#include<iostream>
#include"boxArea.h"
#include"boxVolume.h"
using namespace std;

int main(){
    cout<<"enter '1' for area calculation\nor '2' for volume calculation\n";
    int choice;
    float width,height,length;
    cin>>choice;
    if (choice==1){
        cout <<"enter the length, width and height in orde\nr";
        cin>>length>>width>>height;
        boxArea(length,width,height);
    }
    else if(choice==2){
        cout <<"enter the length, width and height in order\n";
        cin>>length>>width>>height;
        boxVolume(length,width,height);
    }
    else{
        cout<<"incorrect input!!\nprogram terminated....\n";
    }
}