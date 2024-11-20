package Nov.ex_20112024;
import java.util.Vector;
public class Lab_202 {
    public static void main(String[] args) {
    Vector v = new Vector();
    v.add("Rohit");
    v.add("Kumar");
    v.add("Sahu");
    v.add("Rahul");
    v.add("Sahu");
        System.out.println(v);
    v.remove("Kumar");
        System.out.println(v.contains("Rahul"));
        System.out.println(v);
    }
}
