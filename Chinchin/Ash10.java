import java.util.Scanner;
 public class Ash10 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter acct pin: ");
     int pin = input.nextInt();

    if (pin == 1234) {
     System.out.println("Account balance is  - $1000");
  }
      else {
        System.out.println("Incorrect PIN");
    }
    }
}
