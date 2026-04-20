import java.util.Scanner;
public class Powers {
  public static void main(String[] args) {
   Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter power of number:  ");
     int n = inputCollector.nextInt();
    
     int powers = 2;
    for (int count = 1; count <= n; count++){
      System.out.println("2^" + count + " = " + powers);
     powers = powers * 2;
    }

   }
}
