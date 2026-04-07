import java.util.Scanner;
 public class Bitter8 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter 4 digit pin: ");
     int pin = input.nextInt();

    if (pin == 1234) {
     System.out.println("Valid pin");
  }
      else {
        System.out.println("Invalid pin");
    }
    }
}
