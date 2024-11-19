package Nov.ex_19112024;
// GENERICS CONCEPT
// Wrapper CLASSES (Integer) is used here
public class Lab_196_1 {
    public static void main(String[] args) {
      temp_sum (23,45);
      temp_sum ("Rohit","Sahu");
    }
    public static Integer temp_sum (Integer a, Integer b) {
        return a+b;
    }
    public static String temp_sum (String a, String b) {
        return a+b;
    }
}
