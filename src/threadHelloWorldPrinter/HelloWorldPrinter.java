package threadHelloWorldPrinter;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("HelloWorld . This is my "+ Thread.currentThread().getName() +" thread.");

    }
}
