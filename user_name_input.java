import java.util.Scanner;
public class user_name_input
{
    public static void main(String args[]){
        System.out.println("enter your name :");
        Scanner input = new Scanner(System.in);
         String name = input.nextLine();
        System.out.println("hello "+name+"!");
    }    
}
  