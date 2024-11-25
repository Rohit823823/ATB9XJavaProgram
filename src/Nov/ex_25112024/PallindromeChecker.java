package Nov.ex_25112024;
import java.util.Scanner;
public class PallindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                // Input string from user
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Check if the string is a palindrome
                boolean isPalindrome = checkPalindrome(input);

                // Output result
                if (isPalindrome) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is not a palindrome.");
                }

                scanner.close();
            }

            // Method to check if a string is a palindrome
            public static boolean checkPalindrome(String str) {
                // Normalize string: remove spaces and convert to lowercase
                str = str.replaceAll("\\s+", "").toLowerCase();

                int start = 0;
                int end = str.length() - 1;

                while (start < end) {
                    if (str.charAt(start) != str.charAt(end)) {
                        return false; // Mismatch found, not a palindrome
                    }
                    start++;
                    end--;
                }

                return true; // No mismatches found, it's a palindrome
            }
        }


