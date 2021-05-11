package ChapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String asteristic = "*";
        System.out.print("Enter the number of asterisks you want");
        for (int counter = 0; counter < 5; counter++) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 30) {
                for (int count = 0; count < num; count++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }
    }
}
