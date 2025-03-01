import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO4ListOperation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

           String command=scanner.nextLine();
           while(!command.equals("End")){

            String[] commandParts=command.split(" ");
            String commandName=commandParts[0];

            switch (commandName){
                case "Add"->{

                    int n= Integer.parseInt(commandParts[1]);
                   numbers.add(n);
                }
                case "Insert"->{
                    int n= Integer.parseInt(commandParts[1]);
                    int index= Integer.parseInt(commandParts[2]);
                    if (index>=numbers.size()){
                        System.out.println("Invalid index");

                    }else{
                        numbers.add(index,n);
                    }


                }case "Remove"->{
                    int index= Integer.parseInt(commandParts[1]);
                    if (index>=numbers.size()){
                        System.out.println("Invalid index");

                    }else{
                        numbers.remove(index);
                    }



                }case "Shift"->{

                    String position= commandParts[1];
                  if (position.equals("left")){
                     int count=  Integer.parseInt(commandParts[2]);
                      for (int i = 1; i <= count; i++) {

                        int number=numbers.getFirst()  ;
                        numbers.removeFirst();
                        numbers.add(number);

                      }

                  }else if (position.equals("right")){
                      int count=  Integer.parseInt(commandParts[2]);
                      for (int i = 1; i <= count; i++) {

                          int number=numbers.getLast();
                          numbers.removeLast();
                          numbers.add(number);
                      }
                  }
                }

               }

               command=scanner.nextLine();
           }
        for (int num:numbers){
            System.out.print(num+ " ");
        }
    }

}
/*
 Add {number} - add number at the end

· Insert {number} {index} - insert number at given index

· Remove {index} - remove that index

· Shift left {count} - first number becomes last 'count' times

· Shift right {count} - last number becomes first 'count' times

 */
