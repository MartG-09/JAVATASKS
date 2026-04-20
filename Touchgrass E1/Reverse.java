import java.util.Scanner;
public class Reverse {
  public static void main(String[] args) {
   Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number:  ");
     int number = inputCollector.nextInt();

    while (number > 0){
     int digit = number % 10;
      System.out.print(digit);
        number /= 10;
    }
System.out.println();

   }
}
