public class TaskNine {
    public static int evenIndexArray(int[] array){
        int number = 0;
            int count = 0;
                int largest = array[0];


        for(count = 0; count < array.length; count++){
            if (count % 2 == 1){
                    number = array[count];
                    
              if (array[count] > largest)  {
                    largest = array[count];
            }
                        
//            System.out.println(number);
                }
         }
                        System.out.println(largest);
    return largest;
    }

            public static void main(String[] args){
                int[] array = {12 , 2 , 46 , 48 , 3};
                 evenIndexArray(array);
            }
}
