package string.assigment_problems;

import java.util.Scanner;

public class Typing {

    static void checkTypingAccuracy(String original, String typed) {
        int matchingCharacters = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchingCharacters++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (matchingCharacters * 100.0) / original.length();

        System.out.println("Accuracy: " + accuracy + "%");

        if (firstMismatch == -1) {
            System.out.println("No mismatch found.");
        } else {
            System.out.println("First mismatch at position: " + (firstMismatch + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        if (original.length() == typed.length() && original.length() > 0) {
            checkTypingAccuracy(original, typed);
        } else {
            System.out.println("Both texts must have the same non-zero length.");
        }

        scanner.close();
    }
}