package Nov.ex_15112024;

public class Lab_172 {
    public static void main(String[] args) {
        // primitive to wrapper class
        int a = 10;
        Integer b = a; // Boxing-->int->Integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        b.intValue();
        Integer a2 = 42;
        int value = a2; // Unboxing Integer --> int
        System.out.println(value);

    }
}
