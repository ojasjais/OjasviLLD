package accessmodifier;

public class Client {
    public static void main(String[] args){
        Student st=new Student();
       // student.name ="ojasvi";  //not accessible since it is pvt
        st.batchid = 123;
        st.age=23;
        st.univname="scaler";
          System.out.println(st);
    }
}
