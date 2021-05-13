package ChapterFive;

import java.util.Scanner;

public class DiamondTwo {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your number");
                int counter1=sc.nextInt();
//counter1 controls the amount of loops and amount of iterations that the program is going to run
                for ( int counter = 1; counter < counter1; counter += 2) {
                    for (int space = counter1; space >=counter; space -= 2) {
                        System.out.print(" ");
                    }
                    for (int count = 1; count <= counter; count++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }



                for (int counter = 1; counter <= counter1; counter += 2) {
                    for (int space = 1; space <= counter; space +=2) {
                        System.out.print(" ");
                    }
                    for (int count = counter1; count >= counter; count--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }


        }



