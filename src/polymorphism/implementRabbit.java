package polymorphism;

public class implementRabbit implements InterfaceeAnimal{
    @Override
    public void walk() {
        System.out.println("Rabbit can walk");
    }

    @Override
    public void eat() {
        System.out.println("Rabbit can eat");
    }

    @Override
    public void run() {
        System.out.println("Rabbit can run");
    }
}
