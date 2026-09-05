package string.assigment_problems;

import java.util.Scanner;

public class Signal {

    static void findLongestStreak(String signalLog) {
        int longestStreak = 1;
        int currentStreak = 1;
        char longestColor = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest streak: " + longestColor);
        System.out.println("Streak length: " + longestStreak);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = scanner.nextLine();

        if (signalLog.length() > 0) {
            findLongestStreak(signalLog);
        } else {
            System.out.println("Signal log cannot be empty.");
        }

        scanner.close();
    }
}