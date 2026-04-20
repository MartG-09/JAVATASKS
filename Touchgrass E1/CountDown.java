import java.util.Scanner;
public class CountDown {
  public static void main(String[] args) {
   Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number:  ");
     int number = inputCollector.nextInt();

    for (int count = number; count > 0; count--){
      System.out.println(count);
    }

    System.out.println("Blast off!");

   }
}
