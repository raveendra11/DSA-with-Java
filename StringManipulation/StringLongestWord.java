package StringManipulation;

public class StringLongestWord {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";

        // Step 1: Split the sentence into words
        String[] words = sentence.split(" ");

        // Step 2: Initialize variables
        String longestWord = "";
        int maxLength = 0;

        // Step 3: Loop through each word
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        // Step 4: Output the result
        System.out.println("The longest word is: " + longestWord);
    }
}
