import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PO7LegendaryFarming {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean isObtained=false;

        Map<String,Integer>materials=new LinkedHashMap<>();
        materials.put("shards",0);
        materials.put("fragments",0);
          materials.put("motes",0);
          String obtainedItem="";

         while (!isObtained){
             String input=scanner.nextLine().toLowerCase();

             String[] data=input.split("\\s+");

             for (int i = 0; i < data.length; i+=2) {
                 int quantity= Integer.parseInt(data[i]);
                 String material=data[i+1];
                 if (!materials.containsKey(material)){
                     materials.put(material,quantity);
                 }else{
                     int currentQuantity=materials.get(material);
                     materials.put(material,currentQuantity+quantity);
                 }

                 int totalQuantity=materials.get(material);
                 if (totalQuantity>=250){
                     if (material.equals("shards")){
                         obtainedItem="Shadowmourne";
                         isObtained=true;
                     }else if(material.equals("fragments")){
                         obtainedItem="Valanyr";
                         isObtained=true;
                     }else if(material.equals("motes")){
                         obtainedItem="Dragonwrath";
                         isObtained=true;
                     }
                 }
                 if (isObtained){
                     materials.put(material,totalQuantity-250);
                     break;
                 }
                 
             }

         }
        System.out.println(obtainedItem +" obtained!");
         materials.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));


    }
}
