import java.util.Arrays;
import java.util.Scanner;

public class PO4WordFilter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String []words= Arrays.stream(scanner.nextLine().split(" "))
                         .filter(word->word.length() % 2 ==0)
                         .toArray(String[]::new);

         //1начин
        for (String word : words) {
            System.out.println(word);

        }
        //2ри начин
        Arrays.stream(words).forEach(System.out::println);


    }
}
