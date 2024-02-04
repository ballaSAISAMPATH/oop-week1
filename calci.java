import java.util.Scanner;
public class calci{
    public static void main(String[] args){
        System.out.println("1-addition\n2-substraction\n3-multiplication\n4-division\nenter the choice : ");
        Scanner input=new Scanner(System.in);
        int choice= input.nextInt();
        System.out.println("enter operand a =");
        float a = input.nextInt();
        System.out.println("enter operand b = ");
        float b= input.nextInt();
        System.out.println("Performing calculation....");
        if (choice==1) 
            System.out.println("a+b = "+(a+b));
        else if (choice==2) 
        System.out.println("a-b = "+(a-b));
        else if (choice==3) 
        System.out.println("a*b = "+(a*b));

        else if (choice==4) 
        System.out.println("a/b = "+(a/b));
        else 
            System.out.println("Invalid input..");
    }
}
