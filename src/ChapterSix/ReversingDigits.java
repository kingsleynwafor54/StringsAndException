package ChapterSix;

public class ReversingDigits {
    public  int reversingDigits(int digit) {
        int number;
        int reverseNumber = 0;
        while (digit > 0) {
            number = digit % 10;
            reverseNumber = reverseNumber * 10 + number;
            digit/=10;
        }

        return reverseNumber;
    }
    public  String palindromeNumbers(int digit){
        String palindrome="";
        if (digit==reversingDigits(digit)){
            palindrome=digit+" is a palindrome";
        }
    else
        palindrome=digit+" is NOT a palindrome";
   return palindrome;
    }
    public static void main(String[] args) {
        ReversingDigits reversingDigits= new ReversingDigits();
        System.out.println( reversingDigits.reversingDigits(12351));
        System.out.println(reversingDigits.palindromeNumbers(123));
        System.out.println(stringPalindrome("king"));

    }

public static StringBuilder stringPalindrome(String sb){
        StringBuilder kingsley=new StringBuilder(sb);
        return kingsley.reverse();
}
}