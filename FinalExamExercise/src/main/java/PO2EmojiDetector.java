import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PO2EmojiDetector {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String text=scanner.nextLine();

        Pattern pattern=Pattern.compile("(:{2}|\\*{2})[A-Z][a-z]{2,}\\1");
        Pattern patternNum=Pattern.compile("\\d");
        Matcher matcherNum= patternNum.matcher(text);
        Matcher matcher= pattern.matcher(text);
        List<String>emojis=new ArrayList<>();
       long coolTresHold=1;
        while (matcherNum.find()){
            coolTresHold*=Integer.parseInt(matcherNum.group());
        }
        while (matcher.find()){
            emojis.add(matcher.group());
        }

        List<String>emoji3=new ArrayList<>();
        for (String emoji : emojis) {
            int sum = 0;
            for (int j = 2; j < emoji.length()-2; j++) {
                sum += emoji.charAt(j);

            }
            if (sum >= coolTresHold) {
                emoji3.add(emoji);

            }
        }

        System.out.println("Cool threshold: "+coolTresHold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n ",emojis.size());
        for (String string : emoji3) {
            System.out.println(string);
        }

    }
}
