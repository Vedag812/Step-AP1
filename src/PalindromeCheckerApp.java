import java.util.Arrays;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome Palindrome");
        int n = 1001;
        PalindromeChecker(n);
    }

    static void PalindromeChecker (int number) {
        String orig = String.valueOf(number);
        String rev = new StringBuilder(orig).reverse().toString();

        if(orig.equals(rev)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }
    }
}
