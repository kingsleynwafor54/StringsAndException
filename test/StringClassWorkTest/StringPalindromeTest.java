package StringClassWorkTest;

import StringPractices.StringPalindrom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringPalindromeTest {
    StringPalindrom stringPalindrom;
    @BeforeEach
    void beforeEquals(){
        stringPalindrom=new StringPalindrom();
    }
@AfterEach
    void afterEqual(){
        stringPalindrom=null;
}
@Test
    void methodShouldTestThatThingsAre(){

        assertTrue(stringPalindrom.isPalindrome("mom"));
        assertTrue(stringPalindrom.isPalindrome("1234321"));
        assertTrue(stringPalindrom.isPalindrome("weew"));
        assertTrue(stringPalindrom.isPalindrome("dad"));
        assertTrue(stringPalindrom.isPalindrome("Kik"));
}
}
