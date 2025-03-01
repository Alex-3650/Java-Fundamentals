import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                                                               .collect(Collectors.toList());

       List<Integer> mergedList=new ArrayList<>();
         int n=numbers.size();

         if (n%2==0){
             for (int i = 0; i < n/2; i++) {

                 System.out.print(numbers.get(i)+numbers.get(numbers.size()-1-i)+ " " );

             }

         }else{
             for (int i = 0; i < n/2; i++) {

                 System.out.print(numbers.get(i)+numbers.get(numbers.size()-1-i)+ " " );

             }
             System.out.print(numbers.get(n/2));



         }


    }
}
