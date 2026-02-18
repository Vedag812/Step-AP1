import java.util.Scanner;

public class Palindromeuc4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String input=sc.nextLine();

        char[] chars=input.toCharArray();

        int start=0;

        int end=chars.length-1;

        boolean isPalindrome=false;

        while(start<end)
        {
            if (chars[start] == chars[end]) {
                isPalindrome = true;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
        }


