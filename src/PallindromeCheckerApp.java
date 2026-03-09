import java.util.*;
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;


        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
public class PallindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + result);
    }
}