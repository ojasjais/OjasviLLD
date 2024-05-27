package abstractclass;

public class Client {
    public static void main(String[] args) { // concrete class
        Animal tiger =new Tiger();
        tiger.walk();
        tiger.eat();
        tiger.sleep();
    }
}
//if we remove eat from tigerr class will become abstract
//lets do it remove eat method
//give error make that class abstract as well
//problem in client class we didnt define tiger object
//cmnt