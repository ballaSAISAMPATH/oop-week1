

class mother {
    int number=4;
    private String code="2233";
    protected String land ="10 acres";
    void getcode(){
        System.out.println(code);
    }
}
class child extends mother{}
public class PPPInheriJava{
public static void main (String[] args){
        child sam = new child();
        System.out.println(sam.number);
        System.out.println(sam.land);
        sam.getcode();

    }
}
