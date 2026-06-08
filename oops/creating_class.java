public class creating_class{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
    }
class Student{
    String name;
    int marks;
    float percentage;
    void calculatepercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }
}