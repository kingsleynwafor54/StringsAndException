package StringPractices;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a meaningful sentence");
    String sentence=sc.nextLine();
    String[]  tokens= sentence.split("");
        System.out.println("Number of element is : "+tokens.length);
        for(String token: tokens) {
            System.out.print(token);
        System.out.print("");

        }
        System.out.println();
int count=0;
        StringTokenizer sb = new StringTokenizer(sentence);
        while (sb.hasMoreTokens()) {
            System.out.println(sb.nextToken());
count++;
       }
        System.out.println("The number of words are "+count);
        }
    }
