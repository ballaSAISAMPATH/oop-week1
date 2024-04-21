import java.io.*;
public class iostream {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream input=new FileInputStream("source");
            FileOutputStream output=new FileOutputStream("destination");
            while(input.available()!=0){
                output.write(input.read());
            }
        }catch (IOException e) {
            System.out.println("file not found\n");
        }
    }
}