package Nov.ex_20112024;
import java.util.List;
import java.util.ArrayList;
public class Lab_204 {
    public static void main(String[] args) {
        List <String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        //fruits1.add(133);
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegetable = new ArrayList();
        vegetable.add("tamato");
        vegetable.add("patato");
        vegetable.add("onion");
        System.out.println(vegetable);

        fruits2.add("Chickoo");

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetable);
        System.out.println(all_fruits);

    }
}
