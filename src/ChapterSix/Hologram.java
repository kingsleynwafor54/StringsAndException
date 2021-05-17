package ChapterSix;

public class Hologram {
    public static void main(String[] args) {

        int space = 9;
        int counter = 0;
        int t1 = 1;
        int space2=0;
        int space3=16;
        for (; counter < 9; counter++) {
            for (int s=space; s > 0; s--) {
                System.out.print(" ");
            }
            for (int a = 1; a ==1; a++) {
                System.out.print("*");
            }

            for (int b=space2;b > 0; b--) {
                System.out.print(" ");
            }
            for (int c= 1; c ==1; c++) {
                System.out.print("*");
            }

            System.out.println();
            space2+=2;
            space--;

        }
        for ( counter=0; counter < 9; counter++) {
        for (int s=0; s <=counter ; s++) {
            System.out.print(" ");
        }
        for (int a = 1; a ==1; a--) {
            System.out.print("*");
        }
            for (int d=space3;d >0; d--) {
                System.out.print(" ");
            }
            for (int e= 1; e ==1; e--) {
                System.out.print("*");
            }
            System.out.println();
            space3-=2;
        }

    }
}