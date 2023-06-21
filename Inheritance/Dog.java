package Inheritance;

public class Dog extends Animal{
    public static void main(String[] args) {
         Animal obj=new Dog();
        obj.nleg=4;
        System.out.println(obj.nleg);
        obj.drink();
        obj.eat();
        obj.movement();
    }

    @Override
    void movement() {
        System.out.println("walk or run");
    }
    
}
