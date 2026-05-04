import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongSumDigitTest {

    @Test
     public void testThatSumEachDigit(){
        long number = 12345;
        long expectedResult = 15;
        long actualResult = LongSumDigit.sumDigits(number);
        assertEquals(actualResult , expectedResult);
        
    }

}
