import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest {

    @Test
        public void TestThatStandardDeviationExists() {
                int[] array = {2 , 3 , 4 , 5 , 6};
                StandardDeviation.sum(array);
        }

    @Test
        public void TestThatSumAddElementInArray(){
                int[] array = {2 , 3 , 4 , 5 , 6};
                double expected = 20;
                double actual = StandardDeviation.sum(array);
                assertEquals(actual , expected);
        }

    @Test
        public void TestThatMeanGetMeanOfElementInArray(){
                int[] array = {2 , 3 , 4 , 5 , 6};
                double expected = 4;
                double actual = StandardDeviation.mean(array);
                assertEquals(actual , expected);
        }

    @Test
        public void TestThatMeanDeviationReturnsRightResultInArray(){
                int[] array = {2 , 3 , 4 , 5 , 6};
                double expected = 10;
                double actual = StandardDeviation.meanDeviation(array);
                assertEquals(actual , expected);
        }

    @Test
        public void TestThatVarianceReturnsRightResultInArray(){
                int[] array = {2 , 3 , 4 , 5 , 6};
                double expected = 2;
                double actual = StandardDeviation.variance(array);
                assertEquals(actual , expected);
        }

    @Test
        public void TestThatStandardDeviationReturnsRightResultInArray(){
                int[] array = {2 , 3 , 4 , 5 , 6};
                double expected = 1.41;
                double actual = StandardDeviation.standardDeviation(array);
                assertEquals(actual , expected);
        }


}
