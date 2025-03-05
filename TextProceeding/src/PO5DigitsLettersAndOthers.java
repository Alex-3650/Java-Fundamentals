import java.io.OutputStream;
import java.util.Scanner;

public class PO5DigitsLettersAndOthers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
           String input=scanner.nextLine();
         StringBuilder text=new StringBuilder();
        StringBuilder nums=new StringBuilder();
        StringBuilder chars=new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {

          char c=input.charAt(i);
            if (Character.isDigit(c)){
                nums.append(c);

            }
            else if (Character.isAlphabetic(c)){
                text.append(c);

            }else{
                chars.append(c);
            }

        }
        System.out.println(nums);
        System.out.println(text);
        System.out.println(chars);
    }
}
