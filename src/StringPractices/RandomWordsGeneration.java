package StringPractices;

import java.util.Random;

public class RandomWordsGeneration {
    public static void main(String[] args) {
        int[] sentence=new int[5];
        Random random=new Random();
        String[] article={"Kingsley","Jesus","Seyi","John"};
        String[] noun={"Mathew","James","peter","katie"};
        String[] verbs={"Job","Jennifer","Paul","Matt"};
        String[] preposition={"kings","Yemi","segun","pete"};
        String sent = null;
    for(int counter=0;counter<sentence.length-1;counter++){
       
        sent = article[counter] + " " + noun[counter] + " " + verbs[counter] + " " + preposition[counter];
        System.out.println(sent);
    }

    }
}
