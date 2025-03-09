import java.util.Scanner;

public class PO1ValidUsernames {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         String[] input=scanner.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            boolean validUserName=validateUserName(input[i]);

            if (validUserName){
                System.out.println(input[i]);

            }


        }
    }

    private static boolean validateUserName(String userName) {
        if (userName.length()<3 || userName.length()>16){
            return  false;
        }

        for (char symbol : userName.toCharArray()) {

            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol!='_' ){
                return false;
            }
            
        }
        return true;

    }
}
