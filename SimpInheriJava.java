import java.util.*;
import java.lang.*;

class mother{
    int number=3;
    String name= "sam";
}
class child extends mother{
}
class SimpleSimpInheriJava{

    public static void main(String args[]){
        child sam=new child();
        System.out.println("number :"+sam.number);
        System.out.println("name : "+sam.name);
    }
}
