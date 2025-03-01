import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO9TASK2ArrayModifier {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
             .map(Integer::parseInt)
             .collect(Collectors.toList());

     String input=scanner.nextLine();
     while (!input.equals("end")){
       String command=input.split(" ")[0];

       switch (command){
           case "swap"->{
            int index1=Integer.parseInt(input.split(" ")[1]);
            int index2=Integer.parseInt(input.split(" ")[2]);
             int n=numbers.get(index1);
             int n2=numbers.get(index2);
           numbers.set(index1,n2);
               numbers.set(index2,n);
           }
           case "multiply" ->{
               int index1=Integer.parseInt(input.split(" ")[1]);
               int index2=Integer.parseInt(input.split(" ")[2]);
               int n=numbers.get(index1);
               int n2=numbers.get(index2);
               int result=n*n2;
               numbers.set(index1,result);
           }
           case "decrease"->{

               for (int i = 0; i < numbers.size(); i++) {
                   int n=numbers.get(i);
                   n--;
                   numbers.set(i,n);
               }
           }

       }

      input=scanner.nextLine();
     }
        System.out.println(numbers.toString().replace("[","").replaceAll("]",""));

    }
}
