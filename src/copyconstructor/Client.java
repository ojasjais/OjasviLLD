package copyconstructor;



public class Client {
    public static void main(String[] args) {
       Student st1= new Student("Ojasvi", "Scaler");
       Student st2=new Student(st1);
//or Student st2=st1; will work
        System.out.println("DEBUG");
        st2.name="Ankur";
    }
}
//both will have different addres