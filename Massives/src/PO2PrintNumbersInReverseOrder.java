import java.util.Scanner;

public class PO2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] numbers=new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(scanner.nextLine());

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ",numbers[numbers.length-1-i] );

        }

         for ( int number : numbers){
             System.out.println( number);
         }


    }
}
