import java.util.Scanner;

public class AnagramChecker4a {
    
    public static boolean areAnagrams(String word1, String word2) {
        // If the lengths are different, they can't be anagrams
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // Convert both words to lowercase and sort their characters
        char[] w1 = word1.toLowerCase().toCharArray();
        char[] w2 = word2.toLowerCase().toCharArray();
        
        // Sort the arrays
        java.util.Arrays.sort(w1);
        java.util.Arrays.sort(w2);
        
        // Compare the sorted arrays
        return java.util.Arrays.equals(w1, w2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();
        
        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }

        scanner.close();
    }
}
