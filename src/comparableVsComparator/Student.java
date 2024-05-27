package comparableVsComparator;



public class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override

    public String toString() {

        return "Student{" +

                "age=" + age +

                ", name='" + name + '\'' +

                '}';

    }

    @Override

    public int compareTo(Student that) {

        if(this.age > that.age ){

            return 1;

//            int temp = A[i];

//            A[i] = A[j];

//            A[j] = temp;

        }

        //-1 means no swapping

        return -1;

    }

}

