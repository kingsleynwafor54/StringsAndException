//package StringPractices;
//
//import java.security.SecureRandom;
//import java.util.Random;
//
//public class RandomWordsGeneration {
//    public static void main(String[] args) {
//        int[] sentence=new int[4];
//        SecureRandom random=new SecureRandom();
//        //Random random=1+ Random();
//
//        String[] article={"Good hygiene","Jesus Loves you","Seyi the Pastor","John the mecko","Mathew the preacher","James the fighter","peter the fisher man"};
//        String[] noun={"Mathew","James","peter","katie","Job","Jennifer","Paul","Matt",};
//        String[] verbs={"Job","Jennifer","Paul","Matt","kings","Yemi","segun","pete"};
//        String[] preposition={"kings","Yemi","segun","pete","Job","Jennifer","Paul","Matt"};
//        String sent = null;
//    for(int counter=0;counter<20;counter++){
//        int random1=  random.nextInt(article.length);
//        int random2=random.nextInt(noun.length);
//        int random3= random.nextInt(verbs.length);
//        int random4=random.nextInt(preposition.length);
//        sent = article[random1] + ", " + noun[random2] + " ," + verbs[random3] + "," + preposition[random4];
//        System.out.println(sent);
//
//
//    }
//}
//}
