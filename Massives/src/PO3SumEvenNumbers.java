import java.util.Arrays;
import java.util.Scanner;

public class PO3SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sum=0;



        String [] text= scanner.nextLine().split(" ");

        int [] numbers=new int[text.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(text[i]);
            if (numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.println( sum);
    }
}
