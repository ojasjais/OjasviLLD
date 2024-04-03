package threadExecutorAndCallables;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    public Integer call() throws Exception{
        Random random=new Random();
        return random.nextInt();
    }
}
