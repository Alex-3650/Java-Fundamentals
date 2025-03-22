import java.util.Scanner;

public class PO1ActivationKeys {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);



         String activationKey=scanner.nextLine();

         String command=scanner.nextLine();


         while(!command.equals("Generate")){
             String [] commandParts=command.split(">>>");
             //Contains>>>{substring}
             //Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}
             //Slice>>>{startIndex}>>>{endIndex}
             switch (commandParts[0]){

                 case "Contains"->{
                     String textToSearch=commandParts[1];
                     if (activationKey.contains(textToSearch)){
                         System.out.printf("%s contains %s\n",activationKey,textToSearch);
                     }else{
                         System.out.println("Substring not found!");
                     }
                 }
                 case "Flip"->{
                     String  type=commandParts[1];
                     int start= Integer.parseInt(commandParts[2]);
                     int end= Integer.parseInt(commandParts[3]);
                     if (type.equals("Upper")){
                         String text=activationKey.substring(start,end);
                         activationKey=activationKey.replace(text,text.toUpperCase());

                     }else{
                         String text=activationKey.substring(start,end);
                         activationKey=activationKey.replace(text,text.toLowerCase());
                     }
                     System.out.println(activationKey);

                 }
                 case "Slice"->{
                     int start= Integer.parseInt(commandParts[1]);
                     int end= Integer.parseInt(commandParts[2]);
                     StringBuilder builder=new StringBuilder(activationKey);
                    builder.replace(start,end,"");
                     activationKey= String.valueOf(builder);
                     System.out.println(activationKey);

                 }

             }

             command= scanner.nextLine();
         }
        System.out.println("Your activation key is: " +activationKey);
    }

}
