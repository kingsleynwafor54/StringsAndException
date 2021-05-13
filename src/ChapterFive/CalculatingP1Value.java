package ChapterFive;

public class CalculatingP1Value {
    public static void main(String[] args) {
        double e = 1;
       // double d=1;
        double counter = 1;
        System.out.println("PITerms       PIValue");
        while (true) {
            if (counter % 2 == 0) {
                e = 4 * 1.0 / counter;
            } else e -= 4 * 10 / counter;
            double k = 4 + e;
            if (k<=3.1415) {
                System.out.println(counter + "       " + k);
            }
            counter++;
        }

        }
    }
