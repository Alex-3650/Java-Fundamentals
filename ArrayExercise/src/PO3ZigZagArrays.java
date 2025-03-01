import java.util.Arrays;
import java.util.Scanner;

public class PO3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int row = 1; row <= n; row++) {
            String input = scanner.nextLine();

            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);
            if (row % 2 != 0) {

                arr1[row - 1] = firstNumber;
                arr2[row - 1] = secondNumber;
            } else {
                arr1[row - 1] = secondNumber;
                arr2[row - 1] = firstNumber;
            }

        }
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}

