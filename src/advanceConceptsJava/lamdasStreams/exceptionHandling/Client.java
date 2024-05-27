package advanceConceptsJava.lamdasStreams.exceptionHandling;

public class Client {
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        cal.divide("10","null");
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at advanceConceptsJava.lamdasStreams.exceptionHandling.Calculator.divide(Calculator.java:5)
//        at advanceConceptsJava.lamdasStreams.exceptionHandling.Client.main(Client.java:6)
    }
}
