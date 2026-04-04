 import java.util.Scanner;
public class Friend4 {
  public static void main(String[] args){
    Scanner boy = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
      int num = boy.nextInt();

    System.out.print("Enter 2nd number: ");
      int num1 = boy.nextInt();

    int difference = num - num1;

        System.out.println("Difference is: " + difference);

    }
}

