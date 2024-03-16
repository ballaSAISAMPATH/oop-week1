import java.lang.*;
import java.util.*;

class addition{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
    
}
public class MethodOLJava{
    
    
    public static void main(String args[]){
        addition obj=new addition();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}