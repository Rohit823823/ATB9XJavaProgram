package Nov.ex_15112024;

public class Lab_178 {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Can't do trim for null, Are you mad? ");;
        }
        System.out.println("End");

        // Unchecked - java.lang.NullPointerException
        // jvm - compile -> jvm knows at the Runtime -> Terminated the program.
    }
}
