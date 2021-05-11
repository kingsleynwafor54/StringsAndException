package ChapterFive;
public class FaceBook2 {
    public static void main(String[] args) {
        double userBase = 1_000_000_000;
        double growthRate = 0.04;
        double targetBase;

        int month=1;
        while(true) {
            targetBase = userBase * Math.pow(1.0 + growthRate, month);
            boolean isCorrect= targetBase >= 2_000_000_000;
            if (isCorrect) {
                System.out.println("On the "+month+"th month of the year FaceBook rose from "+userBase+" to "+targetBase);
                break;
            }
            month++;
        }
//        System.out.println("FaceBook reached 1.5B January the next year");


    }

}
