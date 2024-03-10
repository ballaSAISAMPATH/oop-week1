import java.lang.*;
import java.util.Scanner;

class AccessSpecifierDemo{
    private int priVar;
    protected int proVar;
    public int pubVar;

    public void setVar(int priValue,int proValue, int pubValue){
        this.priVar=priValue;
        this.proVar=proValue;
        this.pubVar=pubValue;
     }
     void getVar(){
        System.out.println("private variable value :"+priVar);
     }
}
class Sub extends AccessSpecifierDemo{
    
    void getVar(){
        System.out.println("protected variable value :"+proVar);
}
}
class AbsEncapJava{
    public static void main(String[] args){
        int privalue,provalue,pubvalue;
        AccessSpecifierDemo obj1 = new AccessSpecifierDemo();
        Sub obj2=new Sub();
        Scanner input=new Scanner(System.in);
        System.out.println("enter the private, protected and public values in order : ");
        privalue=input.nextInt();
        provalue=input.nextInt();
        pubvalue=input.nextInt();
        obj1.setVar(privalue,provalue,pubvalue);
        obj2.setVar(privalue,provalue,pubvalue);
        obj1.getVar();
        obj2.getVar();
        System.out.println("public variable value : "+obj1.pubVar);
    }
}