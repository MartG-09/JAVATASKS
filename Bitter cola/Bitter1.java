import java.util.Scanner;
 public class Bitter1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a 5 digit number: ");
     int dig = input.nextInt();
    int first = (dig%10);
     int last = (dig/10000)%10;

        int Sum = first+last;    

    System.out.println("Sum of first and last digit is: " + Sum);

    }
 }
