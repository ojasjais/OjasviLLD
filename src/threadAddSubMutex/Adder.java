package threadAddSubMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
Count count;
Lock lock;

    public Adder(Count count , Lock lock) {
        this.count = count;
        this.lock=lock;
    }


    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
           // lock.lock();
            //use synchronized word
            synchronized (count) {
                count.value += i;
                //  lock.unlock();
            }
        }
    }
}
