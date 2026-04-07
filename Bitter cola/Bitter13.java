import java.util.Scanner;
 public class Bitter13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Birth year: ");
     int bir = input.nextInt();

    System.out.print("Enter Current year: ");
     int cur = input.nextInt();

      int age = cur - bir;

    System.out.println("Your are " + age + "yrs old");
    
    if (age >= 65) {
     System.out.println("You are eligible for senior citizen discount");
  }
      else {
        System.out.println("Not up to the age");
    }

    }
 }
