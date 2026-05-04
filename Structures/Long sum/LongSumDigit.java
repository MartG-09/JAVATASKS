public class LongSumDigit {
    public static long sumDigits(long number) {

            long newNumber = 0;
        long sum = 0;
        while (number > 0) {
            newNumber = number % 10;

             sum = sum + newNumber;

            number /= 10;
        }
        return sum;
        
    }

}
