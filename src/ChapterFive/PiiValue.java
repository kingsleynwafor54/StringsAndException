package ChapterFive;

public class PiiValue {
    public static void main(String[] args) {
        double pii=0;
        int i;
        for(i=0;i<0;i++){
          if(i==1){
              pii=4/i;
          }
        else if(i%2==0){
            pii=pii-4/(i+(i-1));
          }
        else {
            pii =pii +(double)4/(i+(i-1));
          }
            System.out.println(pii);
        }
    }
}
