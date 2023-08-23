package codingChallenges;
import java.util.Scanner;


/*Challenge: Palindrome Checker

        A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and
        backward (ignoring spaces, punctuation, and capitalization).

        Your Task: Write a Java program that does the following:
        Prompt the user for input.
        Check if the provided input is a palindrome.
        Output whether the input is a palindrome or not.

        Requirements:
        Your program should ignore spaces, punctuation, and capitalization.
        The program should be efficient.
        Handle potential edge cases.

        Tips:
        Use the java.util.Scanner class to get input from the user.
        Consider using methods from the java.lang.String class to help manipulate and check the string.

        Bonus:
        Make your program capable of handling multi-line input (like a poem) and check if the whole content is
        a palindrome.

        Complete the isPalindrome method and expand on the program as you see fit. Enjoy coding!

        Here's a start for you:*/
public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word, phrase, or number to check if it's a palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome!");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // TODO: Implement this method
        return false;
    }
}





