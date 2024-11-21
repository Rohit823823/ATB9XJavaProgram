package Nov.ex_21112024;
import java.util.Stack;

public class Lab_210 {
    public static void main(String[] args) {
    // Stack
        // Last in --> First out
       //Stack s = new Stack();
        //s.add("Rohit");
        //s.add("Sahu");
        //s.add("Rahul");
        //s.add("Sahu");
        //System.out.println(s);

        Stack s = new Stack();
        s.push("Rekha");
        s.push("Sahu");
        s.push("Krishna");
        s.push("Sahu");
        s.add("Anchal");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Choudhury"));
        System.out.println(s);
        s.add("Shivansh");
        s.push("Arohi");
        System.out.println(s);

        s.add(0,"Sahufamily");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }
}
