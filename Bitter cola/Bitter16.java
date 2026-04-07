import java.util.Scanner;
 public class Bitter13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter price: ");
     double price = input.nextDouble();

    System.out.print("Enter discount: ");
     double dis = input.nextDouble();

      double count = (dis/100);

        double discount = (count*price);    

    System.out.printf("Discount of price is: %.2f%n" , discount);

    }
 }
