package threadSemaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Shirt> store = new LinkedList<>();
       int maxsize=5;
      Semaphore semaProducer = new Semaphore(5);
      Semaphore semaConsumer = new Semaphore(0);

        Producer p1 = new Producer(store,"p1",maxsize ,semaProducer , semaConsumer);
        Producer p3 = new Producer(store,"p3",maxsize ,semaProducer,semaConsumer);
        Producer p4 = new Producer(store,"p4",maxsize,semaProducer,semaConsumer);
        Producer p5 = new Producer(store,"p5",maxsize,semaProducer,semaConsumer);
        Producer p2 = new Producer(store,"p2",maxsize,semaProducer,semaConsumer );

        Consumer c1 = new Consumer(store,"c1",maxsize,semaProducer,semaConsumer);
        Consumer c2 = new Consumer(store,"c2",maxsize,semaProducer,semaConsumer);
        Consumer c3 = new Consumer(store,"c3",maxsize,semaProducer,semaConsumer);
        Consumer c4 = new Consumer(store,"c4",maxsize,semaProducer,semaConsumer);
        Consumer c5 = new Consumer(store,"c5",maxsize,semaProducer,semaConsumer);

        Thread tp1= new Thread(p1);
        tp1.start();
        Thread tp2= new Thread(p2);
        tp2.start();
        Thread tp3= new Thread(p3);
        tp3.start();
        Thread tp4= new Thread(p4);
        tp4.start();
        Thread tp5= new Thread(p5);
        tp5.start();

        Thread tc1= new Thread(c1);
        tc1.start();
        Thread tc2= new Thread(c2);
        tc2.start();
        Thread tc3= new Thread(c3);
        tc3.start();
        Thread tc4= new Thread(c4);
        tc4.start();
        Thread tc5= new Thread(c5);
        tc5.start();


    }
}
