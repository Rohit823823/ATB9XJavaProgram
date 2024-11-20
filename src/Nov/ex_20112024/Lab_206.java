package Nov.ex_20112024;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab_206 {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // ArrayLists based on user-defined categories.

        // names, ages - store them
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList();
        ArrayList <Integer> ages = new ArrayList();

        String continueInput = "Y"; // continue variable for input loop
        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter names:");
            String name = scanner.nextLine();
            names.add(name);

            System.out.println("Enter ages:");
            int age = scanner.nextInt();
            ages.add(age); // add age to age list

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();
        }

        // Display the collected data
        System.out.println("\nNames:" +names);
        System.out.println("Ages: "+ages);

        for (Object o1: names) {
            System.out.println(o1);
        }
        for (Object o2: ages) {
            System.out.println(o2);
        }
        scanner.close();


    }
}
