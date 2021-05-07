package StringPractices;

public class CheckWordsSimilarities {
    public static void main(String[] args) {
        System.out.println( occurrenceOfWords("kingsley is going to the market","kingsley"));
    }
public static int occurrenceOfWords(String words,String word1){
        int count=0;
        for(int counter=0;counter<words.length()-1;counter++){
            if (words.regionMatches(0,word1,8,8))
            count++;
        }
return count;

    }
}
