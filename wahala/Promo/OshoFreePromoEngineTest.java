import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest {

    @Test
        public void TestThatOshoFreePromoEngineExists(){
                OshoFreePromoEngine.calculatePercentDiscount(4000 , "StarBoy");
        }

    @Test
        public void TestThatAllCaseIsWorking(){
                double expected = 5400.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(6000 , "StarTER10");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatInvalidAmount(){
                double expected = 0.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(-4000 , "StarTER10");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo5000WithoutPromoCode(){
                double expected = 5000.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(5000 , "fateth19");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo5000WithPromoCode(){
                double expected = 4500.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(5000 , "StarTER10");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo15000WithoutPromoCode(){
                double expected = 15000.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(15000 , "Rtdgd19");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo15000WithPromoCode(){
                double expected = 12000.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(15000 , "BIGBOY20");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo30000WithoutPromoCode(){
                double expected = 30000.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(30000 , "BIGBOY20");
                assertEquals(expected , actual);
        }

    @Test
        public void TestThatCartTotalIsEqualTo30000WithPromoCode(){
                double expected = 19500.0;
                double actual = OshoFreePromoEngine.calculatePercentDiscount(30000 , "OSHOFREE35");
                assertEquals(expected , actual);
        }
    
}




