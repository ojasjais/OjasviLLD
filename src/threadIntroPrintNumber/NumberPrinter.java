package threadIntroPrintNumber;

public class NumberPrinter implements Runnable{
    int toPrint;
    public NumberPrinter(int toPrint)
    {  //constructor
        this.toPrint= toPrint;
    }
    @Override
    public void run() {

     System.out.println("Number :" + Thread.currentThread().getName() +"=>"+ toPrint);


    }
}
