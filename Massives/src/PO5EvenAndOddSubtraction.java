import java.util.Scanner;

public class PO5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int odd=0;
        int even=0;
        int sum=0;

        String [] input=scanner.nextLine().split(" ");

        int [] numbers=new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);
            if (numbers[i]%2==0){
                even+=numbers[i];
            }
            else{
                odd+=numbers[i];
            }

        }
        sum=even-odd;
        System.out.println(sum);
    }
}
