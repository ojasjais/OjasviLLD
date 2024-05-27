package advanceConceptsJava.lamdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       HelloWorldPrinter hwp =new HelloWorldPrinter();
//       Thread thread = new Thread(hwp);
//        thread.start();
        //using Anonymous Class

//        Runnable hwp = new Runnable() {
//////            @Override
//             public void run() {
//////                System.out.println("HelloWorld");
//////           }
//////        };
////

//        Thread t1 = new Thread(() -> System.out.println("hi"));
//        t1.start();

//  Instructor i = new Instructor() {
//            @Override
//            public void teach(int noOfStu, String batch) {
//                System.out.println("Student:" + noOfStu + " , batch:" + batch);
//            }
//        };
//        i.teach(10,"A");
//
//        //event shorter using lambda
//      Instructor i2 = (noOfStu, batch) ->{
//          System.out.println("Student:" + noOfStu + " , batch:" + batch);
//        };
//       i2.teach(20,"B");
//
//        Instructor i3 = (noOfStu, batch) -> System.out.println("Student:" + noOfStu + " , batch:" + batch);
//
//        i3.teach(30,"C");

        //for  switch case
//        int x=10;
//        switch (x){
//            case 1: {
//                System.out.println("Peace");
//            }
//            case 2: {
//                System.out.println("Poverty");
//            }
//            case 3: {
//                System.out.println("Paisa");
//            }
//        }

        //using lambda
        //enhanced switch case
//        switch (x){
//            case 1 -> System.out.println("Peace");
//            case 2 -> System.out.println("Poverty");
//            case 3 -> System.out.println("Paisa");
       // }

       // stream
     // printing number
       List<Integer> list = Arrays.asList(1,2,3);
        //enhanced for loop
//        for (int i: list) {
//            System.out.println(i);
//
//        }
//
//      //  using stream
//        list.stream().forEach(i -> System.out.println(i));
    //  squaring number check if even then print
//        for (int i=0;i<list.size();i++){
//            int sq=list.get(i)*list.get(i);
//            if(sq%2 == 0 ){
//                System.out.println(list.get(i));
//            }
//        }
//        list.stream().forEach(i -> System.out.println(i*i) );
//        //map-> map the value coming into
        list.stream()
                //used to convert datatype
                .map(i -> i*i)
               .filter(i -> i%2==0)
                .forEach(i -> System.out.println(i) );

    }
}
