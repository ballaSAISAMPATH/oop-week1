import java.io.*;
public class exception_handling {
    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("xyz");
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND\n");
        }
        try{
            Class.forName("noClass");
        }
        catch(ClassNotFoundException e){
            System.out.println("CLASS NOT FOUND\n");
        }
        try {
            FileOutputStream file=new FileOutputStream("sample");
            file.write(12);
        } catch (Exception e) {
            System.out.println("IO-EXCEPTION\n");
        }
        try {
            int arr[]=new int[1];
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ARRAY OUT OF BOUND\n");
        }
        try {
            String str=null;
            System.out.println(str.length());

        } catch (Exception e) {
            System.out.println("NULL POINTER EXCEPTION ENCOUNTERED\n");
            
        }
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException obj){
            System.out.println("ARITHMETIC EXCEPTION\n");
        }
    }
}
