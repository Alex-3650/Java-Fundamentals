import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PO2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String text=scanner.nextLine();
         String regex="\\+359([-\\s])2\\1\\d{3}\\1\\d{4}\\b";


         Pattern pattern=Pattern.compile(regex);
        Matcher phone= pattern.matcher(text);

        List <String> validList=new ArrayList<>();

        while (phone.find()){

            validList.add(phone.group());


        }
        System.out.print(String.join(", ",validList));
    }
}
