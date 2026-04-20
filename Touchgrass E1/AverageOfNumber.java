import java.util.Scanner;
public class AverageOfNumber {
  public static void main(String[] args) {
   Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a positive number(Enter negative to stop):  ");
     int number = inputCollector.nextInt();

    int sum = 0;
    int count = 0;

    while (number > 0) {
    sum = sum + number;
    System.out.print("Enter a positive number(Enter negative to stop):  ");
     number = inputCollector.nextInt();
     count++;

    }
        int average = sum / count;
         System.out.printf("The sum of the number is %d%n" , sum);
         System.out.printf("The average of the number is %d%n" , average);
   
    }
}
