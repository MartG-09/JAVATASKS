import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BackToSenderTest {
    
    @Test 
        public void testThatSuccessfulDeliveryIsLessThan50Percent(){
//            Given
               int successfulDelivery = 25;

//             When
               int expectedRiderPayment = BackToSender.BackToSenderLogistic(successfulDelivery);

//             Check
                int actualRiderPayment = 9000;

                assertEquals(actualRiderPayment , expectedRiderPayment);
        }
    
        @Test
            public void testThatSuccessfulDeliveryIsBetween50To59Percent(){
//                Given
                int successfulDelivery = 50;

//                 When
                int expectedRiderPayment = BackToSender.BackToSenderLogistic(successfulDelivery);

//                Check
                int actualRiderPayment = 15000;
                assertEquals(actualRiderPayment , expectedRiderPayment);
            }
    
        @Test
            public void testThatSuccessfulDeliveryIsBetween60To69Percent(){
//                Given
                int successfulDelivery = 60;

//                 When
                int expectedRiderPayment = BackToSender.BackToSenderLogistic(successfulDelivery);

//                Check
                int actualRiderPayment = 20000;
                assertEquals(actualRiderPayment , expectedRiderPayment);
            }
    
        @Test
            public void testThatSuccessfulDeliveryIsGreaterOrEqualTo70Percent(){
//                Given
                int successfulDelivery = 80;

//                 When
                int expectedRiderPayment = BackToSender.BackToSenderLogistic(successfulDelivery);

//                Check
                int actualRiderPayment = 45000;
                assertEquals(actualRiderPayment , expectedRiderPayment);
            }
}



