import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberReverseTest{

    @Test
      public void testThatNumberReverses(){
           int number = 2951;
           int expected = 1592;
           int actual = NumberReverse.reverse(number);
           assertEquals(actual , expected);
      }

}
