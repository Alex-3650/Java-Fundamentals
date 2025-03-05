import java.util.Scanner;

public class PO2RepeatStrings {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String [] words=scanner.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {

            int length=words[i].length();
            for (int j = 0; j < length; j++) {
                System.out.print(words[i]);

            }

        }
    }
}
