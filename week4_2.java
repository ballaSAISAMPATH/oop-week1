public class week4_2 {
    public static void main(String[] args) {
        week4_2 obj1 = new week4_2("SAI SAMPATH",511,92.5,"MVGR",33);
        System.out.println("\n"+" details of student1: ");
        obj1.display();
        week4_2 obj2 = new week4_2();
        System.out.println("\n"+" details of student2: ");
        obj2.display();
        
    }
    String fullName;
    int rollNum;
    double semPerentage;
     String collegeName;
    int collegeCode;
    week4_2()
    {
        this(null,0,0.0,"MVGR",33);
    }
    week4_2(String fullName,int rollNum, double semPerentage,String collegeName,int collegeCode )
    {
        this.fullName=fullName;
        this.rollNum=rollNum;
        this.semPerentage=semPerentage;
        this.collegeName=collegeName;
        this.collegeCode=collegeCode;
    }
    void display() {
        System.out.println(
                "Full Name: " + this.fullName +"\nRoll Number: " + this.rollNum +"\nSemester Percentage: " + this.semPerentage +"\nCollege Name: " + this.collegeName +"\nCollege Code: " + this.collegeCode
        );
    
    }
        protected void finall() 
        {  
        System.out.println("Object is destroyed by the Garbage Collector");  
        }  
    }