import java.util.*;
public class PallindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters until pointers cross
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
