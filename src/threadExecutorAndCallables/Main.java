package threadExecutorAndCallables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberGenerator generator1= new RandomNumberGenerator();
        RandomNumberGenerator generator2= new RandomNumberGenerator();
        ExecutorService executor= Executors.newFixedThreadPool(2);
        Future<Integer> x= executor.submit(generator1);
        Future<Integer> y= executor.submit(generator2);
        int sum=x.get()+y.get();
        System.out.println(sum);
    }
}
