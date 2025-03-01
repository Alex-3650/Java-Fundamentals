import java.util.Scanner;

public class PO2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().toLowerCase();
        printVowel(text);
    }
    public static void printVowel(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {

            if      (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'u'
                    || text.charAt(i) == 'y' || text.charAt(i) == 'o' || text.charAt(i) == 'i') {
                count++;
            }

        }
        System.out.println(count);
    }
}
