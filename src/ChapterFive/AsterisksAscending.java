package ChapterFive;

public class AsterisksAscending {

    public static void main(String[] args) {

        for(int counter=1; counter<=10 ;counter++){
            for (int secondCounter = 1; secondCounter <= counter; secondCounter++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int counter =1; counter <=10; counter++) {

            for (int secondCounter =10; secondCounter >=counter; secondCounter--) {
                System.out.print("*");

            }

            System.out.println();
        }

        System.out.println();


        for (int counter = 1; counter <= 10; counter++) {
            for (int space = 10; space >= counter; space--) {
                System.out.print(" ");
            }
            for (int count = 1; count <= counter; count++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int counter = 1; counter <= 10; counter ++) {
            for (int space = 1; space <= counter; space++) {
                System.out.print(" ");
            }
            for (int count = 9; count >= counter; count--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
