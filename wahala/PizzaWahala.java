import java.util.Scanner;
public class PizzaWahala {
  public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
    
    System.out.println(">>> W E L C O M E   T O   P I Z Z A   W A H A L A <<<");
    System.out.println("         . Order your PIZZA!! without WAHALA!! .");
    System.out.println("\n     >  Select any PIZZA of your choice <");
    System.out.println("== Pizza type            Number of slices        Price per box ==");
    System.out.println("\n   1. Sapa size                 4                       2500");
    System.out.println("\n   2. Small money               6                       2900");
    System.out.println("\n   3. Big boys                  8                       4000");
    System.out.println("\n   4. Odogwu                   12                       5200");

        System.out.print("Choose any option of your choice:  ");
        int option = inputCollector.nextInt();

        switch(option) {
         case 1: System.out.println("\n= SAPA SIZE =");
                      System.out.print("\nEnter number of people:  ");
                       int people = inputCollector.nextInt();
        
                     int box = people / 4;
                      if (people % 4 == 0) {
                       System.out.println("\n> Number of box need is:  " + box);
                        System.out.println("\n> Number of slices left over is:  " + "0 Slices left");
                        System.out.println("\n> Amount to be paid is:  " + (box*2500));
                      } 
                        else if (people % 4 != 0) {
                           int boxes = box + 1;
                            int left = ((4*boxes) - people);
                         System.out.println("\n> Number of box needed is:  " + boxes);  
                          System.out.println("\n> Number of slices left over is:  " + left + " Slices left");
                            System.out.println("\n> Amount to be paid is:  " + (boxes*2500)); 
                        }
            break;

         case 2: System.out.println("\n= SMALL MONEY =");
                      System.out.print("\nEnter number of people:  ");
                       int number = inputCollector.nextInt();
        
                     int keep = number / 6;
                      if (number % 6 == 0) {
                       System.out.println("\n> Number of box need is:  " + keep);
                        System.out.println("\n> Number of slices left over is:  " + "0 Slices left");
                        System.out.println("\n> Amount to be paid is:  " + (keep*2900));
                      } 
                        else if (number % 6 != 0) {
                           int kept = keep + 1;
                            int over = ((6*kept) - number);
                         System.out.println("\n> Number of box needed is:  " + kept);  
                          System.out.println("\n> Number of slices left over is:  " + over + " Slices left");
                            System.out.println("\n> Amount to be paid is:  " + (kept*2900)); 
                        }
            break;

         case 3: System.out.println("\n= BIG BOYS =");
                      System.out.print("\nEnter number of people:  ");
                       int boy = inputCollector.nextInt();
        
                     int bus = boy / 8;
                      if (boy % 8 == 0) {
                       System.out.println("\n> Number of box need is:  " + bus);
                        System.out.println("\n> Number of slices left over is:  " + "0 Slices left");
                        System.out.println("\n> Amount to be paid is:  " + (bus*4000));
                      } 
                        else if (boy % 8 != 0) {
                           int buses = bus + 1;
                            int leftover = ((8*buses) - boy);
                         System.out.println("\n> Number of box needed is:  " + buses);  
                          System.out.println("\n> Number of slices left over is:  " + leftover + " Slices left");
                            System.out.println("\n> Amount to be paid is:  " + (buses*4000)); 
                        }
            break;

         case 4: System.out.println("\n= ODOGWU =");
                      System.out.print("\nEnter number of people:  ");
                       int odo = inputCollector.nextInt();
        
                     int car = odo / 12;
                      if (odo % 12 == 0) {
                       System.out.println("\n> Number of box need is:  " + car);
                        System.out.println("\n> Number of slices left over is:  " + "0 Slices left");
                        System.out.println("\n> Amount to be paid is:  " + (car*5200));
                      } 
                        else if (odo % 12 != 0) {
                           int cars = car + 1;
                            int many = ((12*cars) - odo);
                         System.out.println("\n> Number of box needed is:  " + cars);  
                          System.out.println("\n> Number of slices left over is:  " + many + " Slices left");
                            System.out.println("\n> Amount to be paid is:  " + (cars*5200)); 
                        }
            break;

            default: {
                            System.out.println("\nInvalid input, try again!!");
                            }
        }

  }
}


