import java.util.Arrays;
import java.util.Scanner;

public class PO6EXE {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] arr= Arrays.stream
                (scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
