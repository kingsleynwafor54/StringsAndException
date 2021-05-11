package ChapterFive;

import java.util.Scanner;

public class BarChatPrintingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0, e = 0;

        int counter = 1;
        while (counter < 6) {
            System.out.println("Enter your number");
            int number = sc.nextInt();
            if (counter == 1 && number >= 1 && number <= 30) {
                a = number;
                counter++;
            } else if (counter == 2 && number >= 1 && number <= 30) {
                b = number;
                counter++;
            } else if (counter == 3 && number >= 1 && number <= 30) {
                c = number;
                counter++;
            } else if (counter == 4 && number >= 1 && number <= 30) {
                d = number;
                counter++;
            } else if (counter == 5 && number >= 1 && number <= 30) {
                e = number;
                counter++;
            } else System.out.print("Invalid number");
        }
            int asterisks = 0;
            for (int count = 0; count < 5; count++) {
                if (count == 0) {
                    asterisks = a;
                } else if (count == 1) {
                    asterisks = b;
                } else if (count == 2) {
                    asterisks = c;
                } else if (count == 3) {
                    asterisks = d;
                } else if (count == 4) {
                    asterisks = e;
                }
                for (int i = 0; i <= asterisks; i++) {
                    System.out.print("*");
            }
                System.out.println();

            }

        }

    }
