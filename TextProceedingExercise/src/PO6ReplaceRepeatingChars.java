import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class PO6ReplaceRepeatingChars {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        StringBuilder replacedText= new StringBuilder();

        replacedText.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {

           if (input.charAt(i)!=input.charAt(i-1)){
               replacedText.append(input.charAt(i));
           }
        }
        System.out.println(replacedText);
        }


}
