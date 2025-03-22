import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PO2FancyBarcodes {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt( scanner.nextLine());

        Pattern pattern=Pattern.compile("\\@\\#+[A-Z][A-Za-z0-9]{4,}[A-Z]\\@\\#+");
        Pattern pattern2=Pattern.compile("[0-9]+");
        for (int i = 0; i < n; i++) {

            String textBarCode=scanner.nextLine();
            Matcher matcher=pattern.matcher(textBarCode);
            Matcher matcher2=pattern2.matcher(textBarCode);


            if (matcher.find()){
                String number="";
                StringBuilder text= new StringBuilder();
                while (matcher2.find()){

                    text.append(matcher2.group());
                }
                if (text.isEmpty()){
                   number="00";
                }else{
                    number=text.toString();
                }

                System.out.println("Product group: "+ number);
            }else{
                System.out.println("Invalid barcode");
            }

        }
    }
}
