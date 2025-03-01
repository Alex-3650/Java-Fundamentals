import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO2ShoppingList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<String> groceries= Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());


          String input=scanner.nextLine();

          while (!input.equals("Go Shopping!")){

              String command=input.split(" ")[0];

              switch (command){
                  case "Urgent"->{
                      String product=input.split(" ")[1];
                      if (!groceries.contains(product)){
                          groceries.addFirst(product);
                      }
                  }
                  case "Unnecessary"->{
                      String product=input.split(" ")[1];
                      groceries.remove(product);
                  }
                 case "Correct"->{
                     String product=input.split(" ")[1];
                     String product2=input.split(" ")[2];
                     if (groceries.contains(product)){
                         groceries.set(groceries.indexOf(product),product2);
                     }
                 }
                 case "Rearrange"->{
                     String product=input.split(" ")[1];
                     if (groceries.contains(product)){
                         groceries.remove(product);
                         groceries.addLast(product);
                     }
                 }
              }
              input=scanner.nextLine();
          }
        System.out.println();
        for (int i = 0; i <groceries.size() ; i++) {
            if (i<groceries.size()-1){
                System.out.print(groceries.get(i)+", ");
            }
        }
        System.out.print(groceries.getLast());
    }
}
