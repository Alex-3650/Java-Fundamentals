import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO3Inventory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<String> groceries= Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

               String text=scanner.nextLine();

               while (!text.equals("Craft!")){
                   String command=text.split(" - ")[0];

                   switch (command){
                       case "Collect"->{
                           String item=text.split(" - ")[1];
                           if (!groceries.contains(item)){
                               groceries.add(item);
                           }
                       }
                       case "Drop"->{
                           String item=text.split(" - ")[1];
                           groceries.remove(item);
                       }
                       case "Combine Items"->{
                           String input=text.split(" - ")[1];
                           String oldItem=input.split(":")[0];
                           String newItem=input.split(":")[1];
                           if (groceries.contains(oldItem)){
                               groceries.add(groceries.indexOf(oldItem)+1,newItem );
                           }

                       }
                       case "Renew"->{
                           String item=text.split(" - ")[1];
                           if (groceries.contains(item)){
                               groceries.remove(item);
                               groceries.add(item);
                           }

                       }

                   }
                   text=scanner.nextLine();

               }

        System.out.print(groceries.toString().replace("[","").replace("]",""));
    }
}
