import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        displayWelcomeMessage();
    }

    private static void displayWelcomeMessage() {
        Scanner sc = new Scanner(System.in);

        // UC1: Take input
        System.out.println("UC1 Application initialized successfully.");
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // UC2: Palindrome check
        boolean isPalindrome = checkPalindrome(text);

        if (isPalindrome) {
            System.out.println("UC2: Text is a palindrome.");
        } else {
            System.out.println("UC2: Text is not a palindrome.");
        }

        // UC3: Reverse the string and compare
        reverseAndCheck(text);

        sc.close();
    }

    // UC2
    private static boolean checkPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // UC3
    private static void reverseAndCheck(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("UC3: Reversed text is: " + reversed);

        if (text.equals(reversed)) {
            System.out.println("UC3: Text is a palindrome.");
        } else {
            System.out.println("UC3: Text is not a palindrome.");
        }
    }
}
