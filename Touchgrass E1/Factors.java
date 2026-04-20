import java.util.Scanner;
public class Factors {
  public static void main(String[] args) {
   Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number:  ");
     int number = inputCollector.nextInt();
    
    for (int count = 1; count <= number; count++){
        if (number % count == 0){
        System.out.println(count + "   is a  factor of " + number);
        }

    }

   }
}
