package StringPractices;

import java.util.Locale;
import java.util.Scanner;

public class letterOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you sentence");
        String s = sc.nextLine();
        System.out.println("enter your letter");
        char k=sc.next().charAt(0);
        characterSearch(s,k);
    }
        public static void characterSearch (String input1,char input2){


            int count = 0;
            int counter = 0;
            for (; counter < input1.length() - 1; counter++) {
                if (input1.charAt(counter) == input2)
                    count++;
            }
            System.out.println(count);


        }
    }



