package ChapterFive;

public class PrintingMultipleTrianglesInALine {
    public static void main(String[] args) {


        int t1 = 1, t2 = 10, space1 = 12, space2 = 5;


        for (int i = 0; i < 10; i++) {
            for (int a = t1; a > 0; a--) {// for the first triangle
                System.out.print("*");
            }
            for (int b = space1; b > 0; b--) {// this gives space
                System.out.print(" ");
            }
            for (int c = t2; c > 0; c--) {// this print the descending triangle
                System.out.print("*");
            }
            for (int d = space2; d > 0; d--) {//this gives space
                System.out.print(" ");
            }
            for (int c = t2; c > 0; c--) {
                System.out.print("*");
            }
            for (int b = space1; b > 0; b--) {
                System.out.print(" ");
            }
            for (int a = t1; a > 0; a--) {
                System.out.print("*");
            }
            System.out.println();

            t1++;
            space1--;
            t2--;
            space2 += 2;
        }
    }
}