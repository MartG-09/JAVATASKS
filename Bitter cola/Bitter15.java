import java.util.Scanner;
 public class Bitter15 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
     int num = input.nextInt();

    
    if (num >= 11 && num < 100) {
     System.out.println("It between 10 and 100");
  }
      else {
        System.out.println("Invalid");
    }
    }
}

   
