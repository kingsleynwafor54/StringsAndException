package StringPractices;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringComparing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you user");
        String c1 = sc.next();
        System.out.println("Enter you userInput");
        String c2 = sc.next();
       // int king=user.compareTo(userInput);
        if (c1.compareTo(c2) >0){
            System.out.println("c1 greater than c2");
        }
        else if(c1.compareTo(c2) < 0) {
            System.out.println("c1 lesser than c2");
        }
        else
            System.out.println("equal");

    }

}