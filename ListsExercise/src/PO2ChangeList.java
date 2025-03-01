import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO2ChangeList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command=scanner.nextLine();
        while(!command.equals("end")){

            if (command.contains("Delete")){

                int n=Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(List.of(n));


            }else if (!command.equals("insert")){
                int n=Integer.parseInt(command.split(" ")[1]);
                int index=Integer.parseInt(command.split(" ")[2]);

                numbers.add(index,n);
            }


            command=scanner.nextLine();
        }
        for (int num:numbers){
            System.out.print( num+ " ");
        }


    }
}
