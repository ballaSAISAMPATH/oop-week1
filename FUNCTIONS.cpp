#include<iostream>
using namespace std;

class Box{
  
    
        float l,b,h;
        public:
            //member inside class...
            void boxArea(float length, float width, float height){
                
                cout<<"Area = "<<2*(length*width+width*height*length*height)<<endl;
        
            }
            friend void displayDimensions(float length, float width, float height);
            void boxVolume(float length, float width, float height);
        
    };

//member outside class...
void Box :: boxVolume(float length, float width, float height){
    cout<<"volume = "<<length*width*height<<endl;
}

//inline function...
inline void greeting(){cout<<"hello user!!!\n";}

//friend function...
void displayDimensions(float length, float width, float height){
    cout<<"length = "<<length<<", width = "<<width<<", heigth = "<<height;
}


int main(){
    greeting();
    Box a;
    cout<<"enter '1' for area calculation\nor '2' for volume calculation\n";
    int choice;
    float width,height,length;
    cin>>choice;
    if (choice==1){
        cout <<"enter the length, width and height in order";
        cin>>length>>width>>height;
        a.boxArea(length,width,height);
    }
    else if(choice==2){
        cout <<"enter the length, width and height in order";
        cin>>length>>width>>height;
        a.boxVolume(length,width,height);
    }
    else{
        cout<<"incorrect input!!\nprogram terminated....";
    }  
    displayDimensions(length,width,height); 
}

