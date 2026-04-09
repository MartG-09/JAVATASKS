import java.util.Scanner;
 public class PrintDownN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

   System.out.print("Enter number: ");
    int userInput = input.nextInt();
      int N = userInput;
    
    int i = N;
     while(i >=1){ 
         System.out.println(i);
            i--;
    }

    }
}
