import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text=scanner.nextLine();
        int num= Integer.parseInt(text.split(" ")[0]);
        int power= Integer.parseInt(text.split(" ")[1]);

        while(numbers.contains(num)){
            int index=numbers.indexOf(num);

             int start=Math.max(0,index-power);
             int end=Math.min(numbers.size()-1,index+power);

            if (end >= start) {
                numbers.subList(start, end + 1).clear();
            }
        }



        int sum=0;
        for (int number:numbers){
           sum+=number;
        }
        System.out.println(sum);
    }
}

