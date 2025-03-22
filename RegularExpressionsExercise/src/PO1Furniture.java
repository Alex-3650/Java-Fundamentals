import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PO1Furniture {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();
         String regex=">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+[.]?[0-9]*)!(?<quantity>[0-9]+\\b)";
         Pattern pattern=Pattern.compile(regex);


        double sum=0;
        System.out.println("Bought furniture:");

         while(!input.contains("Purchase")){
             Matcher matcher= pattern.matcher(input);

             if (matcher.find()){
                 String furniture= matcher.group("furniture");
                 double price=Double.parseDouble(matcher.group("price"));
                 int quantity=Integer.parseInt(matcher.group("quantity"));

                 sum+=(price*quantity);
                 System.out.println(furniture);
             }
             input=scanner.nextLine();
         }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
