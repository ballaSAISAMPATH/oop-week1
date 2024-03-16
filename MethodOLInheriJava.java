import java.util.*;
import java.lang.*;

class Parent{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

class Child extends Parent{};

public class MethodOLInheriJava {
    public static void main(String args[]){
        Child son=new Child();
        System.out.println(son.add(1,2));
        System.out.println(son.add(1,2,3));

    }
}
