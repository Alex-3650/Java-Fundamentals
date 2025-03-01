import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    String command=scanner.nextLine();
    while(!command.equals("end")){
      if (command.contains("Add")){
          int n=Integer.parseInt(command.split(" ")[1]);
          numbers.add(n);
      }else if (command.contains("Remove")){
          int n=Integer.parseInt(command.split(" ")[1]);
          numbers.remove(Integer.valueOf(n));
      }else if (command.contains("RemoveAt")){
          int n=Integer.parseInt(command.split(" ")[1]);
          numbers.remove(n);
      }else if (command.contains("Insert")){
          int number=Integer.parseInt(command.split(" ")[1]);
          int index=Integer.parseInt(command.split(" ")[2]);
          numbers.set(index,number);
      }

      command=scanner.nextLine();
    }
    for (int nums:numbers){
        System.out.print(nums+ " ");
    }



    }

}
