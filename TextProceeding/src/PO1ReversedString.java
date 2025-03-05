import java.util.Scanner;

public class PO1ReversedString {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equals("end")){
           StringBuilder reversedWord= new StringBuilder();

            for (int i = input.length()-1; i >=0 ; i--) {
                char currentSym=input.charAt(i);
                reversedWord.append(currentSym);

            }

            System.out.println(input+" = "+reversedWord);



            input=scanner.nextLine();
        }
    }
}
