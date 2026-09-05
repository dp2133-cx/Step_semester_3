package string.assigment_problems;

import java.util.Scanner;

public class Movie {

    static void classifyWordLengths(String review) {
        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {
            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short words: " + shortWords);
        System.out.println("Medium words: " + mediumWords);
        System.out.println("Long words: " + longWords);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = scanner.nextLine();

        if (!review.trim().isEmpty()) {
            classifyWordLengths(review);
        } else {
            System.out.println("Review cannot be empty.");
        }

        scanner.close();
    }
}