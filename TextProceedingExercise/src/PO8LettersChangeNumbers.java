import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class PO8LettersChangeNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] input=scanner.nextLine().split("\\s+");

         double sum=0;
        for (String string : input) {

            double result=calculateResult(string);

           sum+=result;
        }
        System.out.printf("%.2f",sum);

    }
    public static double calculateResult(String code){

        char letterBefore=code.charAt(0);
        char lastNumber=code.charAt(code.length()-1);
        double  number= Double.parseDouble((code.substring(1,code.length()-1)));

        if (Character.isUpperCase(letterBefore)){

            number/=  (letterBefore-64);
        }else {
            number*=(letterBefore-96);
        }

        if (Character.isUpperCase(lastNumber)){

            number-=  (lastNumber-64);
        }else {
            number+=(lastNumber-96);
        }

      return number;
    }

}
