package overriding2;

public class B extends A{
    void doSomething(){ //changed return type  to void
        System.out.println("bye");;
    }
}
//over riding - same method signature ,same return type ,happen btw parent and class