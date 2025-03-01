import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO9PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemovedElements=0;

        while(!numbers.isEmpty()){
            int position=Integer.parseInt(scanner.nextLine());
       /*position<0
         position>number.size-1


       */

            if (position<0){
                sumRemovedElements+=numbers.getFirst();
                numbers.removeFirst();
                int num=numbers.getLast();
                numbers.addFirst(num);
            }else if(position>numbers.size()-1){
                sumRemovedElements+=numbers.getLast();
                numbers.removeLast();
                int num=numbers.getFirst();
                numbers.add(num);

            }else{
                int numberToRemove=numbers.get(position);
                    numbers.remove(position);
                    sumRemovedElements+=numberToRemove;
                    modifiedList(numbers,numberToRemove);

            }
        }
        System.out.println(sumRemovedElements);
    }
    public static  void modifiedList(List<Integer> numbers,int removedNumber){

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum=numbers.get(i);
            if (currentNum>removedNumber){
               currentNum-=removedNumber;
            }else{
                    currentNum+=removedNumber;
            }
            numbers.set(i,currentNum);

        }
    }
}
