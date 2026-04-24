public class abstraction {
    public static void main(String[] args) {
        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}
class horse extends Animal{
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}