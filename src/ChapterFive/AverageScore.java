package ChapterFive;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int gradeCounter = 0;
        int total = 0;
        while (gradeCounter < 3) {
            System.out.println("Enter your Score");
            score = scanner.nextInt();
            total += score;

            gradeCounter++;
        }

        int average = total /gradeCounter;
        System.out.println(average + "  " + gradeCounter);

    }
}
