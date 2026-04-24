public class constructor {
    public static void main(String[] args) {
Student s1=new Student();
Student s2=new Student("govind kumar");
Student s3=new Student(123);
    }
}
class Student{
    String name;
    int rollno;
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.rollno=roll;
    }
}
