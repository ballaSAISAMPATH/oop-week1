#include<iostream>
using namespace std;

class Sample{
    public:
    virtual void play_a_game()=0;
    virtual void cook_food()=0;
};
class sub_sample{
    public:
    virtual void play_a_game(){
        cout<<"play chess\n";
    };
    virtual void cook_food(){
        cout<<"prepare biryani!!\n";
    };
};
int main (){
    sub_sample obj;
    obj.play_a_game();
    obj.cook_food();
}
