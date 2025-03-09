import java.util.Scanner;

public class PO7StringExplosion {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         StringBuilder text= new StringBuilder(scanner.nextLine());
        int totalPower=0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol=text.charAt(i);

            if (currentSymbol == '>'){

                int power=Integer.parseInt(text.charAt(i+1)+"");
                totalPower+=power;

            }else if(totalPower>0){
                text.deleteCharAt(i);
                totalPower--;
                i--;
            }

        }
        System.out.println(text);
    }
}
