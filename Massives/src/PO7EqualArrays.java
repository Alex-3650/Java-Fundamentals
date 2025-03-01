import java.util.Arrays;
import java.util.Scanner;

public class PO7EqualArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int values=0;

        int [] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] nums2=Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (nums[i]!=nums2[i] ) {

                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;

            }

        }
        System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
