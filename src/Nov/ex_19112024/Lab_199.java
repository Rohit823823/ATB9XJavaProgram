package Nov.ex_19112024;
// ARRAY LIST
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class Lab_199 {
    public static void main(String[] args) {
        //  Collection list = new ArrayList(); // Dynamic Dispatch -
        //        List list1 = new ArrayList(); // Dynamic Dispatch -
        ArrayList studentList = new ArrayList();
        studentList.add("Rohit");
        studentList.add("Sahu");
        studentList.add("Sahu"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);
        System.out.println(studentList);


    }
}
