public class copy_constructor {
    public static void main(String[] args) {
Student s1=new Student();
s1.name="govind kumar";
s1.rollno=231007;
s1.password="govind";
s1.marks[0]=10;
        s1.marks[1]=83;
       s1. marks[2]=33;
Student s2=new Student(s1);
s2.password="xyz";
s2.marks[2]=88;
for(int i=0;i<3;i++){
    System.out.println(s2.marks[i]);
}
    }
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    Student(Student s1){
        marks=new int[3];
        this.name=name;
        this.rollno=rollno;
        this.marks=s1.marks;
        

        
    }
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.rollno=roll;
    }
}
