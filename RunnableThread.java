public class RunnableThread implements Runnable{
    int number;
    RunnableThread(int number){
        this.number=number;
    }
    public void run(){
        for(int i=0;i<=20;i++)
        {
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
    public static void main(String[] args) {
        RunnableThread obj1=new RunnableThread(16);
        RunnableThread obj2=new RunnableThread(30);
        obj1.run();
        obj2.run();
    }
}