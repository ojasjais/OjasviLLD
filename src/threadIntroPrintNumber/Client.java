package threadIntroPrintNumber;

public class Client {
    public static void main(String[] args) {

        for(int i=0;i<=100 ;i++){
            NumberPrinter num= new NumberPrinter(i);
            Thread thread= new Thread(num);
            thread.start();
        }
    }
}
