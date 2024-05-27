package advanceConceptsJava.lamdasStreams.exceptionHandling;

public class Calculator {
    public void divide(String a ,String b){
        try {
            int x=Integer.parseInt(a);
            int y=Integer.parseInt(b);
            System.out.println(x /y);
        }
        catch (ArithmeticException e){
            System.out.println("dont divide by 0");
        }
        //add more catch
         catch (NumberFormatException e){
             System.out.println("number in string not correct");
         }
    }
}
