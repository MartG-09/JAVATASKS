 import java.util.Scanner;
public class Friend21 {
  public static void main(String[] args){
    Scanner boy = new Scanner(System.in);

    System.out.print("Enter base: ");
      int base = boy.nextInt();

    System.out.print("Enter height: ");
      int heig = boy.nextInt();

    int area = (base * heig)/2;

        System.out.println("Area of triangle is: " + area);

    }
}
