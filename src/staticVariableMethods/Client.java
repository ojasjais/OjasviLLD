package staticVariableMethods;

public class Client {
    public static void main(String[] args) {
        //access univ name
        System.out.println(Student.univName); //run //gives null
        //go to student assign variable to univName
        //give gvps output

        Student st= new Student();
        st.name="ojasvi";
        st.address="bhadohi";
        st.age=24;
        st.univName="wwps";
        //change
        System.out.println(st.univName);
    }
}
