#include<iostream>
using namespace std;

void boxArea(float length, float width, float height){
    cout<<"Area = "<<2*(length*width+width*height*length*height)<<endl;
}