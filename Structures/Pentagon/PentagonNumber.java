public class PentagonNumber {
    public static int getPentagonalNumber(int number){

        int numberPentagonal = (number*((3*number) - 1)) / 2;
    
            return numberPentagonal;
    }
}
