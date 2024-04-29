 class threadClass1 extends Thread{
    int number;
    threadClass1 (int number){
        this.number=number;
    }
    public synchronized void  run(){
        for(int i=1;i<=26;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        
    }
}
class  threadClass2  extends Thread{
    int number;
    threadClass2 (int number){
        this.number=number;
    }
    public synchronized void  run(){
        for(char i='a';i<='z';i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        
    }
}
public class Synchronization{
    public static void main(String[] args) {
        threadClass1 obj1 =new threadClass1(3);
        threadClass2 obj2 =new threadClass2(30);
            obj1.start();
            obj2.start();
        }
}
   

