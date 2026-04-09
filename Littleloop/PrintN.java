import java.util.Scanner;
 public class PrintN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

   System.out.print("Enter number: ");
    int userInput = input.nextInt();
      int N = userInput;
    
    int i = 1;
     while(i <= N){ 
         System.out.println(i);
            i++;
    }

    }
}
