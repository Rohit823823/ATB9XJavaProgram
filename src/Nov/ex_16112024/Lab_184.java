package Nov.ex_16112024;

public class Lab_184 {
    public static void main(String[] args) {
int a = 1;
int c = 0;
        try {
            c = 10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will surely be executed");
        }


    }
}
