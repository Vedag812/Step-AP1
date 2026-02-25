import java.util.Arrays;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeChecker(input);
    }

    static void PalindromeChecker(String str) {
        int n = str.length();
        for(int i = str.length()-1; i >= 0; i--) {

            if (str.charAt(i) != str.charAt(n - i -1)) {
                System.out.println(str + " is not Palindrome.");
                break;
            } else {
                System.out.println(str + " is Palindrome.");
                break;
            }
        }
    }
}
