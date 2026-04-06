import java.util.Scanner;
 public class Ash24 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base: ");
     int base = input.nextInt();

    System.out.print("Enter height: ");
     int height = input.nextInt();

    int area = (base * height)/2;

        System.out.println("Area of triangle is: " + area);

    }
}
