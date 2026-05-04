import java.util.Scanner;

public class MenstrualCycleApp {
  public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

                printLn("""
                                        ===================================================
                                            W E L C O M E  T O  M E N S T R U A L  A P P
                                                      What do you want to know??
                                        ===================================================

                                         1.  MENSES PHASE

                                         2. THE FOLLICULAR PHASE

                                         3. OVULATION PHASE

                                         4. THE LUTEAL PHASE

                                         5. KNOW ABOUT YOUR MENSTRUAL-CYCLE
                                    """);

        print("\n     Select options:  ");
            int options = inputCollector.nextInt();

    
            switch(options){
                case 1: print("""
                                              \n   >> M E N S E S  P H A S E <<
                                          know all need to know!!

                                    """);

                                mensesPhase();
                            break;

                case 2: print("""
                                              \n   >> F O L L I C U L A R  P H A S E <<
                                              know all need to know!!

                                    """);

                                follicularPhase();
                            break;

                case 3: print("""
                                              \n   >> O V U L A T I O N  P H A S E <<
                                            know all need to know!!

                                    """);

                                ovulationPhase();
                            break;

                case 4: print("""
                                              \n   >> T H E  L U T E A L  P H A S E <<
                                              know all need to know!!

                                    """);

                                lutealPhase();
                            break;
                                
            }
  
    }

                public static void print(String message){
                    System.out.print(message);
               }

                public static void printLn(String message){
                    System.out.println(message);
               }

         public static void mensesPhase(){

               Scanner inputCollector = new Scanner(System.in);

                System.out.print("  Enter number of days in present month:  ");
                   int days = inputCollector.nextInt();

           System.out.print("  Enter date of menstruation(begins):  ");
                  int number = inputCollector.nextInt();
       
               int sum = number + 3;
                int less = sum - days;


               int total = number + 7;
                    int lesser = total - days;

                    for(int count = number; count < total; count++){
                number += 1;
                if (number == days)
                break;            
            }


            if (sum > days && total > days)    System.out.println("\n   Your menses period we end between " + less + " and " + lesser + " of next month. ");
                    if (sum <= days && total > days)    System.out.println("\n   Your menses period we end between " + sum + " and " + lesser + " of  next month. ");   
                            if (sum <= days && total <= days)    System.out.println("\n   Your menses period we end between " + sum + " and " + number + " of this month. ");
                    }



         public static void follicularPhase(){

               Scanner inputCollector = new Scanner(System.in);

                System.out.print("  Enter how long your period lasted for(in days):  ");
                   int days = inputCollector.nextInt();

                        if(days >= 3 && days < 8){

           System.out.print("\n  Enter date of menstruation(begins):  ");
                  int number = inputCollector.nextInt();

                System.out.print("  Enter number of days in present month:  ");
                   int daysPresent = inputCollector.nextInt();
       
               int date = number + 13;
                    int dateMonth = date - daysPresent;


            if (date > daysPresent)    System.out.println("\n  Your Follicular phase we end on " + dateMonth + " of next month. ");
                if(date <= daysPresent)    System.out.println("\n  Your Follicular phase we end on " + date + " of this month. ");
                    }
            
                
        
                    else {
                            System.out.println("\n  Your menses period is not within the range of 3 to 7 days then you to see your Doctor!!");
                        }

    }


         public static void ovulationPhase(){

               Scanner inputCollector = new Scanner(System.in);

                System.out.print("  Enter how long your period lasted for(in days):  ");
                   int days = inputCollector.nextInt();

                        if(days >= 3 && days < 8){

           System.out.print("\n  Enter date of menstruation(begins):  ");
                  int number = inputCollector.nextInt();

                System.out.print("  Enter number of days in present month:  ");
                   int daysPresent = inputCollector.nextInt();
       
               int date = number + 14;
                    int dateMonth = date - daysPresent;


            if (date > daysPresent)    System.out.println("\n  Your Ovulation phase we start and end on " + dateMonth + " of next month.");
                    
                if(date <= daysPresent)    System.out.println("\n  Your Ovulation phase we start and end on " + date + " of this month. ");
            }
                
        
                    else {
                            System.out.println("\n  Your menses period is not within the range of 3 to 7 days then you to see your Doctor!!");
                        }

    }



         public static void lutealPhase(){

               Scanner inputCollector = new Scanner(System.in);

                System.out.print("  Enter how long your period lasted for(in days):  ");
                   int days = inputCollector.nextInt();

                        if(days >= 3 && days < 8){

           System.out.print("\n  Enter date of menstruation(begins):  ");
                  int number = inputCollector.nextInt();

                System.out.print("  Enter number of days in present month:  ");
                   int daysPresent = inputCollector.nextInt();
       
               int date = number + 15;
                    int dateMonth = date - daysPresent;

                int dateEnd = date + 20;
                  int endDate = dateEnd - daysPresent;

            if (date > daysPresent && dateEnd > daysPresent)    System.out.println("\n   Your menses period we end between " + dateMonth + " and " + endDate + " of next month. ");
                    if (date <= daysPresent && dateEnd > daysPresent)    System.out.println("\n   Your menses period we end between " + date + " of this month " + " and " + endDate + " of  next month. ");   
                            if (date <= daysPresent && dateEnd < daysPresent)    System.out.println("\n   Your menses period we end between " + date + " of this month " + " and " + dateEnd + " of this month. ");
                    
            }
                
        
                    else {
                            System.out.println("\n  Your menses period is not within the range of 3 to 7 days then you to see your Doctor!!");
                        }

    }

}






