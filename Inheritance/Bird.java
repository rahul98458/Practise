package Inheritance;

public class Bird extends Animal {
public static void main(String[] args) {
      Animal obj=new Bird();
        obj.nleg=2;
        System.out.println(obj.nleg);
        obj.drink();
        obj.eat();
        obj.movement();
}
    @Override
    void movement() {
        System.out.println("fly");
    }
    
}
