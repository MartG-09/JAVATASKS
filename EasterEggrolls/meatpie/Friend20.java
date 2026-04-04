 import java.util.Scanner;
public class Friend20 {
  public static void main(String[] args){
    Scanner boy = new Scanner(System.in);

    System.out.print("Enter length: ");
      int len = boy.nextInt();

    System.out.print("Enter width: ");
      int wid = boy.nextInt();

    int area = len * wid;

        System.out.println("Area is: " + area);

    }
}
