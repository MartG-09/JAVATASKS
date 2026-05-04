public class ReverseNumber {
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

            public static boolean isPalindrome(int number) {
                boolean palindrome = false;

                    if (reverse(number) == number) {

                    palindrome = true;
                    }
                    return palindrome;
            }

            public static void main(String[] args) {

                System.out.println(reverse(131) + " " + isPalindrome(131));
//                System.out.println(isPalindrome(131));
            }

}


