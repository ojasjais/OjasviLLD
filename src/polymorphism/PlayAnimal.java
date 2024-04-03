package polymorphism;

public class PlayAnimal {
    private Animal animal;
    public PlayAnimal(){
        animal= new Animal();

    }
    public void doAnimal(){
       animal.eat();
        animal.walk();
      animal.run();
        //go to main
    }
}
