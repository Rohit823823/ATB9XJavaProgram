package Nov.ex_22112024;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
public class Lab_219 {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("Name","Sahubali");
        student1.put("Phone","9064725851");
        student1.put("Address","Berhampur");
        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Atomic Habits");
        book_read_items.add("Multi Millionare");
        book_read_items.add("How to be Rich");
        book_read_items.add("Atomic Habits");
        book_read_items.add("Secret");
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);



    }
}
