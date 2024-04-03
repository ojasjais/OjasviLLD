package copyconstructor;

public class Student {
    String name;
    int age=21;
    double psp;
    String univName;
    boolean isPlaced;

    public Student(String stuName , String universityName){
        name = stuName;
        univName=universityName;
    }
    public Student(Student oldStudent){
        name=oldStudent.name;
        age= oldStudent.age;
        psp= oldStudent.psp;
        univName= oldStudent.univName;
    }
}
