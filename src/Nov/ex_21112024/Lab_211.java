package Nov.ex_21112024;
import java.util.ArrayList;
import java.util.List;
public class Lab_211 {
    public static void main(String[] args) {
        Student s1 = new Student("Ameha","1");
        Student s2 = new Student("Anil","2");
        Student s3 = new Student("Akansha","3");
        List <Student> mystudents = new ArrayList<>();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        System.out.println(mystudents);

    }
}
