package threadAdderSubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();


        Adder a= new Adder(count);
        Subtractor s=new Subtractor(count);

        Thread t1= new Thread(a);
        Thread t2= new Thread(s);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
