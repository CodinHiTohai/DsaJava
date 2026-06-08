public class inherritence {
    public static void main(String[] args) {
        Dog bo=new Dog();
        bo.eat();
        bo.legs=4;
        System.out.println(bo.legs);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breather(){
        System.out.println("breathe");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("fish can swim");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}