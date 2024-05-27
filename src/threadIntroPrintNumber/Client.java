package threadIntroPrintNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

      ExecutorService execute = Executors.newFixedThreadPool(5);
        for(int i=1;i<=100 ;i++){
            NumberPrinter num= new NumberPrinter(i);
            execute.submit(num);
//            Thread thread= new Thread(num);
//            thread.start();
        }
        execute.shutdown();
    }
}
