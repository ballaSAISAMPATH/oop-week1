abstract class  sample{
    void display(){
        System.out.println("good evening\n");
    
    }
    abstract void play_games();
}
public class impure extends sample{
    void play_games(){
        System.out.println("play chess");
    }
    public static void main(String[] args) {
        impure obj = new impure();
        obj.display();
        obj.play_games();
    }
}