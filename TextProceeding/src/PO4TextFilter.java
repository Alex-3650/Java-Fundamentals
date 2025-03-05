import java.util.Scanner;

public class PO4TextFilter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] words= scanner.nextLine().split(", ");

         String text=scanner.nextLine();

        for (int i = 0; i < words.length ; i++) {
            String star="*".repeat(words[i].length());

           text=text.replaceAll(words[i],star);
        }
        System.out.println(text);


    }
}
