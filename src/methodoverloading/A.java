package methodoverloading;

public class A {
    int doSomething(){
        System.out.println("do something without parameter");
        return 0;
    }

    String doSomething(String a){
        System.out.println("do something with returning string");
        return "";
    }
}
