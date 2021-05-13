package ChapterSix;

public class ReversingDigits {
    public static int reversingDigits(int digit) {
        int number;
        int reverseNumber = 0;
        while (digit > 0) {
            number = digit % 10;
            reverseNumber = reverseNumber * 10 + number;
            digit/=10;
        }

        return reverseNumber;
    }
    public static String palindromeNumbers(int digit){
        String palindrome="";
        if (digit==reversingDigits(digit)){
            palindrome=digit+" is a palindrome";
        }
    else
        palindrome=digit+" is NOT a palindrome";
   return palindrome;
    }
    public static void main(String[] args) {
        System.out.println( reversingDigits(111));
        System.out.println(palindromeNumbers(123));
        System.out.println(stringPalindrome("king"));

    }

public static StringBuilder stringPalindrome(String sb){
        StringBuilder kingsley=new StringBuilder(sb);
        return kingsley.reverse();
}
}