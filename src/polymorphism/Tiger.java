package polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("Tiger can eat.");
    }
    public void walk(){
        System.out.println("Tiger can walk");
    }
    public void run(){
        System.out.println("Tiger can run");
    }
}
