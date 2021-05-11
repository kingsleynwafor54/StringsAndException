package ChapterFive;

public class FaceBookUser {
    public static void main(String[] args) {
        double userBase = 1_000_000_000;
        double growthRate = 0.04;
        double targetBase;
        int month=1;
        while(true) {
            targetBase = userBase * Math.pow(1.0 + growthRate, month);
            boolean isCorrect= targetBase >= 1_500_000_000;
            if (isCorrect) {
                System.out.println("On the "+month+"th month of the year FaceBook rose from "+userBase+" to "+targetBase);
                break;
           }
            month++;
            }
        }
    }



