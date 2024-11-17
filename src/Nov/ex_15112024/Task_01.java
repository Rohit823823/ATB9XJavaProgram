package Nov.ex_15112024;
import java.util.Arrays;
public class Task_01 {
    // Frequency of the element in an array
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};

            // Sort the array
            Arrays.sort(arr);

            int count = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                } else {
                    System.out.println(arr[i - 1] + " -> " + count);
                    count = 1;
                }
            }

            // Print the frequency of the last element
            System.out.println(arr[arr.length - 1] + " -> " + count);
        }
    }

