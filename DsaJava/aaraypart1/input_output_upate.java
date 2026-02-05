import java.util.*;
public class input_output_upate {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("english marks is"+marks[0]);
        System.out.println("hindi marks is"+marks[1]);
        System.out.println("math marks is"+marks[2]);

        marks[2]=100;
        System.out.println( "math"+marks[2]);

        System.out.println(marks.length);//count the marks of the length
    }
}
