import java.util.*;

public class PO1CountRealNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double [] numbers= Arrays
                            .stream(scanner.nextLine().split(" "))
                            .mapToDouble(Double::parseDouble).toArray();


         Map<Double,Integer> numberCountMap= new TreeMap<>();


        for (double number : numbers) {
            if (!numberCountMap.containsKey(number)){
             numberCountMap.put(number,1);
            }else{
                numberCountMap.compute(number, (k, currentCount) -> currentCount + 1);
            }
            
        }

        for(Map.Entry<Double,Integer> entry:numberCountMap.entrySet()){

            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
