package pack2;
import pack1.Student;
public class Example {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setName("Puneet");
        s1.setRollno(810);
        System.out.println("name"+s1.getName());
        System.out.println("rollno"+s1.getRollno());
    }
}
