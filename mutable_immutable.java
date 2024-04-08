import java.lang.*;
import java.util.*;
/**
 * mutable_immutable
 */
class sample {
    final void display(){
        System.out.println("hiii");
    }
}
public class mutable_immutable extends sample{
    void display()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        sample obj=new sample();
        obj.display();
    }
}