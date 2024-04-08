interface interface_abs {
    void play_a_game();
    void cook_food();
}

public class interface_pure implements interface_abs{
    public void play_a_game(){
        System.out.println("play chess\n");
    }
    public void cook_food(){
        System.out.println("prepare biryani\n");
    }
    public static void main(String[] args) {
        interface_pure obj=new interface_pure();
        obj.play_a_game();
        obj.cook_food();
    }
}