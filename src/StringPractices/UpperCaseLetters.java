package StringPractices;

import java.util.Locale;
import java.util.Scanner;

public class UpperCaseLetters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input your name");
        String n=sc.nextLine();
        System.out.println(n.toUpperCase(Locale.ROOT));
        System.out.println(n.toLowerCase(Locale.ROOT));
    }
}
