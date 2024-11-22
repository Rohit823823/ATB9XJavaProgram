package Nov.ex_22112024;
import java.util.HashMap;
import java.util.Map;
public class Lab_217 {
    public static void main(String[] args) {
        // Map is key - value
        // name : rohit, rollno : 1
        // phone : 9876543210
        Map m1 = new HashMap(); // Generics
        // Map<String,Object> m1 = new HashMap();
        // Data Type - Fixed
        m1.put("Name","Rohit");
        m1.put("RollNo","001");
        m1.put("PhoneNo","9876543210");
        System.out.println(m1);

        // When to use Map and when to use List?
        // List -> Shopping , single items,
        // name -> pramod, rol : 1


    }
}
