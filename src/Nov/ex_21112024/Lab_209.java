package Nov.ex_21112024;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class Lab_209 {
    public static void main(String[] args) {
    List <String> mylist = new ArrayList<>();
    mylist.add("Rohit");
    mylist.add("Sahu");
    mylist.add("Rahul");
    mylist.add("Sahu");

        System.out.println("---- To print Arraylist 1 ----");

        for (String str: mylist){
            System.out.println(str);
        }
        System.out.println("---- To print Arraylist 2 ----");

        for (int i = 0; i < mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("----- To print ArrayList 3 ----- ");

        //Iterator
        Iterator <String> iterator=mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
