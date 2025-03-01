import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PO3Orders {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Map<String,Double>productprice=new LinkedHashMap<>();
        Map<String,Integer>productquantity=new LinkedHashMap<>();

         String order=scanner.nextLine();

         while (!order.equals("buy")){
             String name=order.split(" ")[0];
             double price= Double.parseDouble(order.split(" ")[1]);
             int quantity= Integer.parseInt(order.split(" ")[2]);

             if (productquantity.containsKey(name)){
            int currentQuantity=productquantity.get(name);
            productquantity.put(name,currentQuantity+quantity);
             }else{
                 productquantity.put(name,quantity);
             }

            productprice.put(name,price);
             order=scanner.nextLine();
         }
        for (Map.Entry<String, Integer> entry : productquantity.entrySet()) {
            String productName=entry.getKey();
            double productPrice=productprice.get(productName);
            System.out.printf("%s -> %.2f%n",productName,productPrice* entry.getValue());
            
        }
    }
}
