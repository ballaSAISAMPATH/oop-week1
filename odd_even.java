import java.util.Scanner;

public class odd_even {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number for odd_even evaluation:");
        int num=input.nextInt();
        if (num%2==1){
            System.out.println(num+" is odd");
        }
        else if (num%2==0){
            System.out.println(num+" is even");
        }
    }
}
