package acessmodifiercheck;

import accessmodifier.Student;

public class Client {
    public static void main(String[] args){
        Student student= new Student();
       // student.name="ojasvi"; not access pvt
      //  student.batchid=123; //not access def
      //  student.psp=98; //not access protected
        student.univname="scaler"; //only access public 
    }
}
