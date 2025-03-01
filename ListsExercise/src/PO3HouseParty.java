import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PO3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
      String input =scanner.nextLine();
      String name=input.split(" ")[0];

      if (input.contains("is going!")){
          if (guests.contains(name)){
              System.out.println(name+" is already in the list ");
          }else{
              guests.add(name);
          }
      }else if (input.contains("is not going!")){
          if (!guests.contains(name)){
              System.out.println(name+" is not in the list ");
          }else{
              guests.remove(name);
          }
      }
        }

        for (String names:guests){
            System.out.println(names);
        }
    }
}
