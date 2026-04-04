 import java.util.Scanner;
public class Friend14 {
  public static void main(String[] args){
    Scanner boy = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
      int num = boy.nextInt();

    System.out.print("Enter 2nd number: ");
      int num1 = boy.nextInt();

    System.out.print("Enter 3rd number: ");
      int num2 = boy.nextInt();

    int sum = num + num1 + num2;

    int average = sum/3;

        System.out.println("Average is: " + average);

    }
}
