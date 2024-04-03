package polymorphism;

import java.util.Random;

public class Client {
//    public static A getObject(){
//        B b=new B();
//        C c=new C();
//
//        Random random=new Random(seed:10);
//        if(random.nextInt()%2==0){
//            return b;
//        }
//        return c;
//    }
    public static void main(String[] args) {
        A a = new A();
        //a.companyName ; // cant access not attribute of a
        ((C) a).companyName="google"; //typecasted
        a.age=5;// can access bcoz attribute of a

        System.out.println(((C) a).companyName);
    }
}
