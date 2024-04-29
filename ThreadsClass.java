public class ThreadsClass extends Thread{
    int number;
    ThreadsClass (int number){
        this.number=number;
    }
    public void run(){
        for(int i=0;i<=20;i++)
        {
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }

    public static void main(String[] args) {
        ThreadsClass obj1 =new ThreadsClass(3);
        ThreadsClass obj2 =new ThreadsClass(30);
        obj1.start();
        obj2.start();
    }
}
