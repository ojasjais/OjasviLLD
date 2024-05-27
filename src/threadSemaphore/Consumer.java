package threadSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private int maxsize;
    Semaphore semaProducer ;
    Semaphore semaConsumer;

    public Consumer(Queue<Shirt> store, String name, int maxsize ,Semaphore semaProducer,Semaphore semaConsumer ) {
        this.store = store;
        this.name = name;
        this.maxsize = maxsize;
        this.semaProducer=semaProducer;
        this.semaConsumer=semaConsumer;
    }

    @Override
    public void run() {
        while(true){
           // if (store.size() > 0) {
            try {
                semaConsumer.acquire();
                System.out.println("Current size:" + store.size() + "Removed by consumer:" + name);
                store.remove();
                semaProducer.release();

            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

           // }
        }
    }
}
