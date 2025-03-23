import java.net.PasswordAuthentication;
import java.util.Scanner;
import java.util.regex.Pattern;


public class PO1PasswordReset {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

      StringBuilder password=new StringBuilder(scanner.nextLine());


         String command=scanner.nextLine();
         while (!command.equals("Done")){

             if (command.equals("TakeOdd")){
                 StringBuilder oddText=new StringBuilder();

                 for (int i = 1; i < password.length(); i+=2) {
                    oddText.append(password.charAt(i));
                 }
               password=oddText;
                 System.out.println(password);

             } else if (command.contains("Cut")) {
                 String [] indexes=command.split("\\s+");
                 int index= Integer.parseInt(indexes[1]);
                 int length= Integer.parseInt(indexes[2]);
                 password.replace(index,index+length,"");
                 System.out.println(password);

             }else if (command.contains("Substitute")){

                 String sub=command.split(" ")[1];
                 String replace=command.split(" ")[2];
                 String password1=password.toString();
                 if (!password1.contains(sub)){
                     System.out.println("Nothing to replace!");
                 }else{
                 password1=password1.replace(sub,replace);
                 password= new StringBuilder(password1);
                     System.out.println(password);
                 }
             }
             command=scanner.nextLine();
         }
        System.out.println("Your password is: "+ password);
    }
}
