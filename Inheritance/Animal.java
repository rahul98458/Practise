package Inheritance;

 abstract class Animal {
    protected int nleg;
    abstract void movement();
    void eat()
    {
        System.out.println("yes eat");
    }
    void drink()
    {
        System.out.println("yes drink");
    }
}
