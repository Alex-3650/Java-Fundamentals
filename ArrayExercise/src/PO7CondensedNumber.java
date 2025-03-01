import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PO7CondensedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



     int[] array = Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(Integer::parseInt)
                .toArray();

     if (array.length==1){
         System.out.println(array[0]);
     }else {
         while (array.length > 1) {
             int[] condensed = new int[array.length - 1];
             for (int i = 0; i < condensed.length; i++) {
                 condensed[i] = array[i] + array[i + 1];
             }
             array = condensed;
         }

         System.out.println(array[0]);
     }
    }
}


