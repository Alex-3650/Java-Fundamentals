import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO1Train {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity=Integer.parseInt(scanner.nextLine());

        String command=scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Add")){
                int n=Integer.parseInt(command.split(" ")[1]);
                list1.add(n);

            }else{
              int n=Integer.parseInt(command);
                for (int i = 0; i < list1.size(); i++) {
                    int currentPassengers=list1.get(i);
                    if (currentPassengers+n<=maxCapacity){
                        int newSum=currentPassengers+=n;
                        list1.set(i,newSum);
                    break;
                    }

                }

            }



            command=scanner.nextLine();
        }
        for (int nums:list1){
            System.out.print( nums+ " ");
        }
    }
}
