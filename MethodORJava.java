import java.lang.*;
import java.util.*;

class one{
    void display(){
        System.out.println("hi guys");
    }
}
class two extends one {
    void display(){
        System.out.println("bye guys");
    }

}
public class MethodORJava {
    public static void main(String args[]){
        two obj=new two();
        obj.display();
    }
}
