package Nov.ex_19112024;
import java.util.ArrayList;
import java.util.List;
public class Lab_200 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1"); //0
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("3"); //3

        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.contains("1")); //int check
        System.out.println(list.size());
        System.out.println(list.indexOf("3")); // find the first occ of elements in the list
        System.out.println(list.lastIndexOf("3")); // find the lat occ of elements in the list
    }
}
