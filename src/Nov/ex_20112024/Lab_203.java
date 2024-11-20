package Nov.ex_20112024;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class Lab_203 {
    public static void main(String[] args) {
    List list = new ArrayList();
    list.add("Milk");
    list.add("Bread");
    list.add("Paneer");
    list.add("Ghee");
    list.add("Yogurt");
    list.add("ButterMilk");
    list.add(123);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));

        System.out.println("--------- default for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------- for each loop");
        for (Object o: list){
            System.out.println(o);
        }

        System.out.println("----------- Array list iterator");
        // Iterator - Anchor - go one by one forward -> get access them
        // HasNext() -> true - If we have a next element
        // Next -> element

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




    }
}
