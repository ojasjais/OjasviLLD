package Abasic;

public class ABasic { //object name will be in capital letter
    //initialize
    String s;
    int id;
    public void display(int id1){
        id=id1;
       // System.out.println("Hello");
        System.out.println(id);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to basic print");

        //create object of class abasic
        ABasic obj= new ABasic();

        //by reference initialize
        obj.s= "I am ref variable";
        System.out.println(obj.s);

        //by method initialization
     //give parameter to display method
      obj.id=10;
      obj.display(10);
    }
}
