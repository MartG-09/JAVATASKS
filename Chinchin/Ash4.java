import java.util.Scanner;
 public class Ash4 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter x1: ");
     double x1 = input.nextDouble();

    System.out.print("Enter y1: ");
      double y1 = input.nextDouble();

    System.out.print("Enter x2: ");
      double x2 = input.nextDouble();

    System.out.print("Enter y2: ");
      double y2 = input.nextDouble();

        double xdi = Math.pow(x2 - x1 , 2);
         double ydi = Math.pow(y2 - y1 , 2);

    double root = Math.sqrt(xdi + ydi);

    System.out.printf("%.2f%n%.2f%n" , xdi , ydi);
     System.out.printf("Distance between them is: %.2f" , root);

    }
 }
