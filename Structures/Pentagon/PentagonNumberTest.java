import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PentagonNumberTest {

    @Test
     public void testThatGetPentagonalNumber(){
        int number = 10;
        int expectedNumber = 145;
        int actualNumber = PentagonNumber.getPentagonalNumber(number);
        assertEquals(actualNumber, expectedNumber);
    }

}
