import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberTest{

    @Test
     public void testThatNumberReverse(){
        int number = 12345;
        int expectedResult = 54321;
        int actualResult = ReverseNumber.reverse(number);
        assertEquals(actualResult , expectedResult);
    }  

        @Test
         public void testThatPalindromeIsWorking(){
            int number = 131;
            boolean expected = true;
            assertTrue(ReverseNumber.isPalindrome(number));
         } 

 }
