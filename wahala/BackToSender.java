public class BackToSender {
  public static int BackToSenderLogistic(int delivery) {

    int result = 0;

       if (delivery < 50) {
        result = ((delivery * 160) + 5000);
      }

      else if (delivery >= 70) {
       result = ((delivery * 500) + 5000);
      }

      else if (delivery >= 60) {
       result = ((delivery * 250) + 5000);
      }

      else if (delivery >= 50) {
        result = ((delivery * 200) + 5000);
      }
        return result;
}
    public static void main(String[] args){
System.out.println(BackToSenderLogistic(25));
System.out.println(BackToSenderLogistic(80));
  }
} 
