import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PO2AMinerTask {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String resource=scanner.nextLine();
        Map<String,Integer> map=new LinkedHashMap<>();
        while(!resource.equals("stop")){
          int quantity=Integer.parseInt(scanner.nextLine());
          if (map.containsKey(resource)){
              map.compute(resource, (k, currentQuantity) -> currentQuantity + quantity);

          }else{
              map.put(resource,quantity);
          }


        resource=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.printf("%s -> %d\n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
        }
    }
}
