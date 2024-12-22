import java.util.Scanner;

public class StringOperations7 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find and display the length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);
        
        // Convert the string to uppercase and display it
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // Convert the string to lowercase and display it
        String lowercase = input.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // Reverse the string and display it
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
        
        // Count the number of vowels in the string
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
        
        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + (isPalindrome ? "Yes" : "No"));
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to count the number of vowels in the string
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
    
    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
