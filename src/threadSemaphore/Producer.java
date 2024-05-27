package threadSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Shirt> store;
    private String name;

   // public Count count; //alt enter
    private int maxsize;
    Semaphore semaProducer;
    Semaphore semaConsumer;



    public Producer(Queue<Shirt> store, String name, int maxsize, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.maxsize = maxsize;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaProducer.acquire();
                System.out.println("Store size :" + store.size() + "Producer name"+ name);
                store.add(new Shirt());
                semaConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
