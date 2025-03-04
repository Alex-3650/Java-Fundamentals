import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PO1CountCharsinaString {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> map=new LinkedHashMap<>();


         char[] arr=scanner.nextLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {

           if (map.containsKey(arr[i])){
               int currentNum=map.get(arr[i]);
               map.put(arr[i],currentNum+1);
           }else{
               map.put(arr[i],1);
           }
           map.remove(' ');

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {


            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
