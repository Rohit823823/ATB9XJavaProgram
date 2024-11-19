package Nov.ex_19112024;

public class Lab_197 {
    public static void main(String[] args) {
        temp_sum (23,45);
        temp_sum ("Rohit","Sahu");
        temp_sum (true,false);
    }
    public static <R> R temp_sum (R a , R b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
