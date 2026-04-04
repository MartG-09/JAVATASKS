 import java.util.Scanner;
public class Friend26 {
  public static void main(String[] args){
    Scanner boy = new Scanner(System.in);

    System.out.print("Enter your name: ");
      String name = boy.nextLine();

    System.out.print("Enter your age: ");
      int age = boy.nextInt();

    System.out.printf("I am %s and i am %dyears old%n" , name , age);

    }
}

