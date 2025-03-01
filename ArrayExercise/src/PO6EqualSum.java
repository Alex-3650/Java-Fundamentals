import java.util.Arrays;
import java.util.Scanner;

public class PO6EqualSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] array= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound=false;

        for (int position = 0; position < array.length; position++) {
            if (array.length  == 1) {
                System.out.println(0);
                break;
            }

            int leftSum=0;
            int rightSum=0;

            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftSum+=array[leftPosition];
                
            }
            for (int rightPosition = position+1; rightPosition < array.length; rightPosition++) {
                rightSum+=array[rightPosition];
            }
            if (leftSum==rightSum) {
                System.out.println(position);
                isFound=true;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
