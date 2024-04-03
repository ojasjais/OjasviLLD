package threadMergeSort;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list= List.of(7,3,4,1,9,8,2,6);
        MergeSorter mergeSorter= new MergeSorter(list);
    }
}
