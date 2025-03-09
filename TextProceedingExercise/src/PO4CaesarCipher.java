import java.util.Scanner;

public class PO4CaesarCipher {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();


        for (char symbol : input.toCharArray()) {
            int ascii=(int)symbol;
            ascii+=3;
            symbol= (char) ascii;
            System.out.print(symbol);
        }
    }
}
