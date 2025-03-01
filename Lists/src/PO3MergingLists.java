import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO3MergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size1= list1.size();
        int size2= list2.size();
        List<Integer> mergedList=new ArrayList<>();
        if (size1>=size2){
            for (int i = 0; i < size2; i++) {
               mergedList.add(list1.get(i));
                mergedList.add(list2.get(i));
            }
            for (int i = size2; i < size1; i++) {
               mergedList.add(list1.get(i));
            }
            for (int nums:mergedList){
                System.out.print(nums+" ");
            }
        }else{
            for (int i = 0; i < size1; i++) {
                mergedList.add(list1.get(i));
                mergedList.add(list2.get(i));
            }
            for (int i = size1; i < size2; i++) {
                mergedList.add(list2.get(i));
            }
            for (int nums:mergedList){
                System.out.print(nums+" ");
            }

        }

    }
}
