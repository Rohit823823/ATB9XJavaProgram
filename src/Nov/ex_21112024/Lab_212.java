package Nov.ex_21112024;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class Lab_212 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Rohit");
        hs.add("Rohit");
        hs.add("rohit");
        hs.add("drohit");
        System.out.println(hs);
    }

}
