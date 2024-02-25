public class week4_1 {
    public static void main(String[] args) {
        week4_1 obj = new week4_1("SAI SAMPATH",511,92.5,"MVGR",33);
        obj.display();
        
    }
    String fullName;
    int rollNum;
    double semPerentage;
     String collegeName;
    int collegeCode;
    week4_1(String fullName,int rollNum, double semPerentage,String collegeName,int collegeCode )
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
        System.out.println("Object destroyed\n");  
        } 
}