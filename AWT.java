import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT extends Frame{
    Label name,dob,parent,roll;
    TextField text1,text2,text3,text4;
    Button button;
    AWT(){
        name=new Label("Name");
        text1=new TextField("",25);
        button=new Button("submit");
        text2=new TextField("",25);

        text4=new TextField("",25);

        text3=new TextField("",25);


        dob=new Label("date of  birth");
        parent =new Label("Parent's name");
        roll=new Label("Roll-number");
        this.add(name);
        this.add(text1);
        this.add(dob);
        this.add(text2);
        this.add(parent);
        this.add(text3);
        this.add(roll);
        this.add(text4);
        this.add(button);
        

        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);    


    }
    
    public static void main(String[] args) {
        AWT obj =new AWT();
    }  
}