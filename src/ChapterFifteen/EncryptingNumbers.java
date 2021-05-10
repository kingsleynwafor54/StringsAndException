package ChapterFifteen;

import BeanException.EncryptingAndDecryptingMessage;

import java.util.Scanner;

public class EncryptingNumbers {
    public static void main(String[] args) {
        EncryptingAndDecryptingMessage sc=new EncryptingAndDecryptingMessage();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter A Four Digit Number");
        int number=scanner.nextInt();
        System.out.println(sc.encryptingMessage(number));
        System.out.println( sc.decryptingMessage(number));


    }
}
