package Nov.ex_22112024;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
public class Lab_222 {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class
        // T1, T2 - they will use one by one.
        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println(ht1);
        System.out.println(" -- ");
        //  ht1.put(3, null); // java.lang.NullPointerException
        // ht1.put(null, "four"); // java.lang.NullPointerException

        HashMap<Integer,String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);
        ht2.put(null, null);
        System.out.println(ht2);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}