package threadMergeSort;

import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    public MergeSorter(List<Integer> arrayToSort){
        this.arrayToSort= arrayToSort;
    }
    @Override
    public List<Integer> call() throws Exception {
        return null;
    }
}
