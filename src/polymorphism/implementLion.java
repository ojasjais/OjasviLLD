package polymorphism;

public class implementLion implements InterfaceeAnimal{
    @Override
    public void run() {
        System.out.println("lion can run");

    }

    @Override
    public void eat() {
        System.out.println("lion can eat");
    }

    @Override
    public void walk() {
        System.out.println("lion can walk");
    }
}
