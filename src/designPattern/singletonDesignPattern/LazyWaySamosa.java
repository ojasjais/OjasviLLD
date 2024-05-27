package designPattern.singletonDesignPattern;

public class LazyWaySamosa {
 private static LazyWaySamosa samosa;//var of samosa //bucket making static

    private LazyWaySamosa(){
        //constructor call when we create object
        //keep constructor private
    }
//to get object creating method

    public static LazyWaySamosa getSamosa() {
        //this method will create  obj of this class
        //if we create this method without static then we will need object to call this method
      //Samosa samosa = new Samosa(); any one can create obj use if 4  times then this will run 4 times
      //using if so tha run 1 times
        if(samosa == null){
         samosa = new LazyWaySamosa();
        }
      return samosa;
    }
}
/*
1. constructor private
2.object create with help of method
3.create field to store obj is pvt
 */
