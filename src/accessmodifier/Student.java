package accessmodifier;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", batchid=" + batchid +
                ", age=" + age +
                ", psp=" + psp +
                ", univname='" + univname + '\'' +
                '}';
    }

    private String name ; //private
    int batchid; //default
    int age;  //default
   protected double psp;   //protected
public String univname; //public
    void changebatch(int newid)
    {
       this.batchid=newid;
    }
//    void givenmock(){
//        System.out.println("given");
//    }
}
