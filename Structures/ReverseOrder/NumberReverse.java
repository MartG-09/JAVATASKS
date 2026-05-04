public class NumberReverse {
    public static int reverse(int number){
        int newNumber = 0;
           int eachDigit = 0;
         
        while (number > 0) {
            newNumber = number % 10;
            eachDigit = eachDigit  * 10 + newNumber;

            number /= 10;
        }
            return eachDigit;
    }
}
