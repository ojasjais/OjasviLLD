package designPattern.singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
       //  new Samosa();//throw error we cant create obj while calling constructor

        LazyWaySamosa samosa1 = LazyWaySamosa.getSamosa();
        System.out.println(samosa1.hashCode());

        LazyWaySamosa samosa2 = LazyWaySamosa.getSamosa();
        System.out.println(samosa2.hashCode());

        System.out.println(EagerWayJalebi.getJalebi().hashCode());
        System.out.println(EagerWayJalebi.getJalebi().hashCode());
    }
}
