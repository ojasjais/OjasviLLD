package abstractclass;

abstract public class Animal {
    String name;
    int age;
    abstract void walk();
    abstract void eat();
    void sleep(){
        System.out.println("Sleeping");
    }
}
