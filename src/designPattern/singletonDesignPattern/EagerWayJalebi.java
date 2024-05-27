package designPattern.singletonDesignPattern;

public class EagerWayJalebi  {

    //eager way of creating Singleton obj
    private static EagerWayJalebi jalebi=new EagerWayJalebi();

    public static EagerWayJalebi getJalebi(){
        return jalebi;
    }
}
