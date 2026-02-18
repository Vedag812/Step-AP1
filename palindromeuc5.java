import java.util.Scanner;
import java.util.Stack;

public class palindromeuc5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a text: ");
            String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = false;

        for (char c : input.toCharArray()) {
            if (c == stack.pop()) {
                isPalindrome = true;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(" palindrome.");
        } else {
            System.out.println("palindrome.");
        }

    }
}
