package threadHelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am " + Thread.currentThread().getName() +" thread. ");

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t= new Thread(hwp);
        t.start();
    }
}
