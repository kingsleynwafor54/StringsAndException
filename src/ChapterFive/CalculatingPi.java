package ChapterFive;

public class CalculatingPi {
    public static void main(String[] args) {
        double e=1;
        double counter;
        for( counter=1;counter<=200_000;counter++){
            if(counter%2==0)
             e= 4*1.0 /counter+2;
            else e-=4*10/counter+2;
            double k=4+e;
//            if(k<=3.14159)
                System.out.println(counter+" "+k);

        }




    }
}
